package org.example.IO777f;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program11 {

    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String text = "Hello Wolrd!";
        byte[] buffer = text.getBytes();
        try {
            baos.write(buffer);
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
        try (FileOutputStream fos = new FileOutputStream("data//hello.txt")) {

            baos.writeTo(fos);
        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }
}