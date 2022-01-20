package org.example.IO777;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ioexsemple1 { String path; File file;

    /*
     * класс для просмотра папок и файлов
     * куда был указан путь пользователем
     * */

    public Ioexsemple1(String path){ // конструктор
        this.path = path;
        this.file = new File(path);
    }

    public String dir() { // возвращает Строку с папками и файлами
        StringBuffer strB1 = new StringBuffer();
        File [] masF = file.listFiles(); // получаем все подкаталоги, файлы в виде массива

        for(File f : masF) {
            //Если файл
            if(f.isFile()) {
                String str4 = String.format("| файл: %-20s ; %n", f.getName()); //задаем формат вывода
                strB1.append(str4); // сюда нельзя вставлять формат
            }

            // если папка
            if(f.isDirectory()) {
                String str = String.format("| папка: %-20s ;%n", f.getName());
                strB1.append(str);
                File [] masF2 = f.listFiles();
                for(File f3 : masF2) {
                    //
                    if(f3.isDirectory()) {
                        String str2 = String.format("|\t| папка: %-20s ;%n", f3.getName());
                        strB1.append(str2);
                    }

                    if(f3.isFile()) {
                        String str3 = String.format("|\t| файл: %-20s;%n", f3.getName());
                        strB1.append(str3);
                    }

                }

            }

        }

        return strB1.toString();

    }

    public void newFile (String s) { // для создания файла с результатами

        File file = new File("src/ioExsemple/", "pusi.txt"); // указываем где будем создавать файл с отчетом
        //и его название с расширением
        try {
            file.createNewFile(); //создаем этот файл
        }catch(IOException e) {
            System.out.println("ошибка в методе newFile 1");
            e.printStackTrace();
        }

        try(FileOutputStream filestream = new FileOutputStream(file.getPath(), true); //создаем поток с возможностью обнавления
            BufferedOutputStream bufstream  = new BufferedOutputStream(filestream, 64)){ // с буферизацией 64 байта
            byte [] byte_str = s.getBytes(); // переводим строку в массив байтов
            bufstream.write(byte_str); // отправляем массив байтов в файл который создали

        }catch (IOException e) {
            System.out.println("ошибка в методе newFile 2");
            e.printStackTrace();
        }

    }
}