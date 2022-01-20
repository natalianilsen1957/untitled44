package org.example.IO777f;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class StringBufferToInputStreamExample {
    public static void main(String args[]) {
        //create StringBuffer object
        StringBuffer sbf = new StringBuffer("StringBuffer to InputStream Example");

        byte[] bytes = sbf.toString().getBytes();

        InputStream inputStream = new ByteArrayInputStream(bytes);
        System.out.println("StringBuffer converted to InputStream");
    }
}
