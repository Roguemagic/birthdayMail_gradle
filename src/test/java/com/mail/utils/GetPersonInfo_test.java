package com.mail.utils;

import org.junit.Test;
import org.junit.Before;

public class GetPersonInfo_test {
    GetPersonInfo getPersonInfo=null;
    String strInfo="Doe,John,1982/08/10,13550530310@163.com";

    @Before
    public void setUp() throws Exception{
        getPersonInfo=new GetPersonInfo();
    }

    @Test
    public void getMonth() throws Exception{
        getPersonInfo.getMonth(strInfo);
    }

    @Test
    public void getDay() throws Exception{
        getPersonInfo.getDay(strInfo);
    }

    @Test
    public void getMailAdres() throws Exception{
        getPersonInfo.getMailAdres(strInfo);
    }

    @Test
    public void getName() throws Exception{
        getPersonInfo.getName(strInfo);
    }
}
