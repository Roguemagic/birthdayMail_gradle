package com.mail.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadFile {
    public static ArrayList<String> readTxtFile(String path) throws Exception{
        FileReader fileReader=new FileReader(path);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        ArrayList<String> personList =new ArrayList<String>();
        String str=null;
        try {
            while ((str = bufferedReader.readLine()) != null) {
                if (str.trim().length() > 2) {
                    personList.add(str);
                }
            }
        }finally {
            bufferedReader.close();
            fileReader.close();
        }

        return personList;
    }
}
