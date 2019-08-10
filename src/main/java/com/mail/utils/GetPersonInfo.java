package com.mail.utils;

public class GetPersonInfo {
    public int getMonth(String personInfo) throws Exception{
        String[] personStr=personInfo.split(",");
        int birthmonth=0;
        if(personStr.length==4){
            String[] birthday=personStr[2].split("/");
            try {
                birthmonth=Integer.parseInt(birthday[1]);
            }catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return  birthmonth;
    }

    public int getDay(String personInfo) throws Exception{
        String[] personStr=personInfo.split(",");
        int birthmtday=0;
        if(personStr.length==4){
            String[] birthday=personStr[2].split("/");
            try {
                birthmtday=Integer.parseInt(birthday[2]);
            }catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return birthmtday;
    }

    public String getMailAdres(String personInfo) throws Exception{
        String[] personStr=personInfo.split(",");
        return personStr[3];
    }

    public String getName(String personInfo) throws Exception {
        String[] personStr = personInfo.split(",");
        return personStr[1];
    }
}
