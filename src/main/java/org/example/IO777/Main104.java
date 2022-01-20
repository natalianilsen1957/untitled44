package org.example.IO777;

import java.io.*;
import java.util.Arrays;

public class Main104 {

    public static void main(String[] args) {

        FileInputStream inputStream1 = null;
        try {
            inputStream1 = new FileInputStream("data/info.txt");
            int code = inputStream1.read();
            System.out.printf("code= %d, (char)code= %c  ", code, (char) code);
            byte[] arr1 = new byte[16];
            int num = inputStream1.read(arr1);
            System.out.println(Arrays.toString(arr1));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream1 != null) {
                    inputStream1.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}