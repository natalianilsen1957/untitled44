package org.example.IO777f;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program7 {

    public static void main(String[] args) {

        try (FileInputStream fin = new FileInputStream("data/in.txt");
             FileOutputStream fos = new FileOutputStream("data/out.txt")) {
            System.out.printf("File size: %d bytes \n", fin.available());

            int i = -1;
            while ((i = fin.read()) != -1) {
                fos.write(i);
                System.out.print((char) i);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}