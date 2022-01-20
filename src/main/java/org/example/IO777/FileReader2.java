package org.example.IO777;

import java.io.*;
import java.util.Arrays;

public class FileReader2 {

    public static void main(String[] args) throws Exception {

        try (FileReader reader1 = new FileReader(new File("data/data.txt"));
            FileWriter writer1 = new FileWriter("data/result.txt", true))
        {
            while (reader1.ready()) //пока есть непрочитанные байты в потоке ввода
            {
                int data3 = reader1.read(); //читаем один символ (char будет расширен до int)
                writer1.write(data3); //пишем один символ (int будет обрезан/сужен до char)
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}