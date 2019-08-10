package com.mail.utils;

import org.junit.Test;
import org.junit.Before;

import javax.mail.Session;
import java.util.Properties;

public class GetMimeMessage_test {
    GetMimeMessage getMimeMessage=null;
    Properties props=null;
    Session session = null;

    String name="lyb";
    String recipientAddress="13550530310@163.com";
    String senderAddress="13550530310@163.com";

    @Before
    public void setUp() throws Exception{
        getMimeMessage=new GetMimeMessage();
        props=new Properties();
        session=Session.getInstance(props);
    }

    @Test
    public void getMimeMessage() throws Exception{
        getMimeMessage.getMimeMessage(session,name,recipientAddress,senderAddress);
    }

}
