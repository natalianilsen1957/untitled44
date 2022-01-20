package org.example.IO777f;

import java.io.*;
import java.io.IOException;

public class Program13 {

    public static void main(String[] args) {
        String text1 = "Hello world!"; // строка для записи
        try (FileOutputStream out = new FileOutputStream("data//notes.txt");
             BufferedOutputStream bos = new BufferedOutputStream(out)) {
            // перевод строки в байты
            byte[] buffer = text1.getBytes();
            bos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}