package com.mail.controller;

import com.mail.utils.GetMimeMessage;
import com.mail.utils.GetPersonInfo;
import com.mail.utils.ReadFile;

import com.mail.beans.personInfo;
import com.mail.beans.mailContent;

import java.util.*;
import java.util.ArrayList;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;

public class SendMailText {

	public void SendMail(String senderadress,String senderpassword)	throws Exception{
		//1、连接邮件服务器的参数配置
		Properties props = new Properties();
		//设置用户的认证方式
		props.setProperty("mail.smtp.auth", "true");
		//设置传输协议
		props.setProperty("mail.transport.protocol", "smtp");
		//设置发件人的SMTP服务器地址
		props.setProperty("mail.smtp.host", "smtp.163.com");
		//2、创建定义整个应用程序所需的环境信息的 Session 对象
		Session session = Session.getInstance(props);
		//设置调试信息在控制台打印出来
		session.setDebug(true);

		ArrayList<String> array= ReadFile.readTxtFile("D:\\work\\mailsend\\cnblogs-master\\birthdayMail_gradle\\person.txt");
		//System.out.println(array);

		Iterator<String> it=array.iterator();
		while(it.hasNext()){
			String str=it.next();
			GetPersonInfo getPersonInfo=new GetPersonInfo();

			int birthmonth= getPersonInfo.getMonth(str);
			int birthmtday=getPersonInfo.getDay(str);

			personInfo person=new personInfo(getPersonInfo.getName(str),getPersonInfo.getMailAdres(str),birthmonth,birthmtday);

			if(person.isToday()){
				GetMimeMessage getMimeMessage=new GetMimeMessage();

				//3、创建邮件的实例对象
				Message msg = getMimeMessage.getMimeMessage(session,person.getName(),person.getMailAdres(),senderadress);
				//4、根据session对象获取邮件传输对象Transport
				Transport transport = session.getTransport();
				//设置发件人的账户名和密码
				transport.connect(senderadress, senderpassword);
				//发送邮件，并发送到所有收件人地址，message.getAllRecipients() 获取到的是在创建邮件对象时添加的所有收件人, 抄送人, 密送人
				transport.sendMessage(msg,msg.getAllRecipients());

				//如果只想发送给指定的人，可以如下写法
				//transport.sendMessage(msg, new Address[]{new InternetAddress("xxx@qq.com")});
				//5、关闭邮件连接
				transport.close();

				}
			//}
		}

	}

}
