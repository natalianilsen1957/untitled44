package org.example.IO777;

import java.io.*;

public class Main103 {

    public static void main(String[] args) throws Exception {
        PrintStream filePrintStream = new PrintStream(new File("C:\\untitled44\\src\\main\\java\\org\\example\\IO777\\testFileOut.txt"));

       /*Сохраним текущее значение System.out в отдельную переменную, чтобы потом
       можно было переключиться обратно на вывод в консоль*/
        PrintStream console = System.out;


        FileInputStream fileInputStream = new FileInputStream("src/main/java/org/example/IO777/testFile.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));


        String str;
        String str2;
        // Присваиваем System.out новое значение
        System.setOut(filePrintStream);
        System.out.println("Эта строка будет записана в текстовый файл");

        while ((str = reader.readLine()) != null)   {
            System.out.println (str);
        }
        reader.close();
        FileInputStream fileInputStream2 = new FileInputStream("src/main/java/org/example/IO777/testFile.txt");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(fileInputStream2));

        // Возвращаем System.out старое значение
        System.setOut(console);
        System.out.println("А эта строка - в консоль!");

        while ((str2 = reader2.readLine()) != null)   {
           System.out.println (str2);
        }
        reader2.close();


    }
}