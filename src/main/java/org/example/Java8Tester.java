package org.example;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Java8Tester {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("data\\result.txt");
            FileOutputStream fout = new FileOutputStream("data\\out.txt");
            BufferedInputStream bin=new BufferedInputStream(fin);
            BufferedOutputStream bout=new BufferedOutputStream(fout);

            int i = 0;
            while ((i = fin.read()) != -1) {
                fout.write(i);
            }
            fin.close();
            fout.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

