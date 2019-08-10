package com.mail.beans;

import java.util.*;

public class personInfo {
    private String name;

    private String mailAdres;

    private int birthMonth;

    private int birthDay;

    public personInfo(String name,String mailAdres,int birthMonth,int birthDay){
        this.name=name.trim();
        this.mailAdres=mailAdres.trim();
        this.birthMonth=birthMonth;
        this.birthDay=birthDay;
    }

    public boolean isToday(){
        boolean isBirthday=false;

        Calendar now =Calendar.getInstance();
        int mon=now.get(Calendar.MONTH)+1;
        int day=now.get(Calendar.DAY_OF_MONTH);

        if(mon==this.birthMonth && day==this.birthDay){isBirthday=true;}

        return isBirthday;
    }

    //public String toString(){
        //return String.format()
   // }

    public String getName(){
        return name;
    }

    public String getMailAdres(){
        return mailAdres;
    }
}
