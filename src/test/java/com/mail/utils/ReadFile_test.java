package com.mail.utils;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReadFile_test {

    @Test
    public void readDateFromTxr() throws Exception {
        ReadFile.readTxtFile("D:\\work\\mailsend\\cnblogs-master\\birthdayMail_gradle\\person.txt");
    }

}
