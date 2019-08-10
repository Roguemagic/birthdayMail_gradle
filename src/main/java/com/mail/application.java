package com.mail;

import com.mail.controller.SendMailText;

public class application {
    //发件人地址
    public static String senderAddress = "13550530310@163.com";
    //发件人账户名
    //public static String senderAccount = "13550530310@163.com";
    //发件人账户密码
    public static String senderPassword = "19940807lyb";

    public static void main(String[] args) throws Exception{
        new SendMailText().SendMail(senderAddress,senderPassword);
    }
}
