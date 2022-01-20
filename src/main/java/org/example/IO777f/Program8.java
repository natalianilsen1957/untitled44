package org.example.IO777f;

import java.io.File;
import java.io.IOException;

import java.io.*;

public class Program8 {

    public static void main(String[] args) {

        try(FileInputStream fin=new FileInputStream("data/in.txt");
            FileOutputStream fos=new FileOutputStream("data/out.txt"))
        {
            byte[] buffer = new byte[fin.available()];
            // считываем буфер
            fin.read(buffer, 0, buffer.length);
            // записываем из буфера в файл
            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}