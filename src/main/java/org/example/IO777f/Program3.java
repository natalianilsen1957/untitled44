package org.example.IO777f;

import java.io.File;
import java.io.IOException;

import java.io.File;

public class Program3 {

    public static void main(String[] args) {

        // определяем объект для каталога
        File dir = new File("C:\\untitled44\\data\\data22");
        boolean created = dir.mkdir();
        if(created)
            System.out.println("Folder has been created");
        // переименуем каталог
        File newDir1 = new File("C:\\untitled44\\data\\data22");
        newDir1.renameTo(new File("data\\newDir22"));
        // удалим каталог
        File newDir2 = new File("C:\\untitled44\\data\\newDir22");
        boolean deleted = newDir2.delete();
        if(deleted){
            System.out.println("Folder has been deleted");}
    }
}