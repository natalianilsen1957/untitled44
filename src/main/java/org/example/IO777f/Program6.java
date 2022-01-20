package org.example.IO777f;

import java.io.FileOutputStream;
import java.io.IOException;

public class Program6 {

    public static void main(String[] args) {

        String text = "Hello world!qwettrewqwrrewqwe werwqwerre dffdsdf 23442345"; // строка для записи
        try(FileOutputStream fos=new FileOutputStream("data/dataNN1.txt"))
        {
            // перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }
}