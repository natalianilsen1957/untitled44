package org.example.A112.n1;

import java.io.File;

public class FileNameFilterExample {

    public static void main(String[] args) {
        String dir = "/Users/pankaj/temp";
        String extension = ".doc";
        findFiles(dir, extension);
    }

    private static void findFiles(String dir, String extension) {
        File file = new File(dir);
        if (!file.exists())
            System.out.println(dir + " Directory doesn't exists");
        File[] listFiles = file.listFiles(new MyFileNameFilter(extension));
        // File[] listFiles = file.listFiles((d, s) -> {
        // return s.toLowerCase().endsWith(extension);
        // });

        if (listFiles.length == 0) {
            System.out.println(dir + "doesn't have any file with extension " + extension);
        } else {
            for (File f : listFiles)
                System.out.println("File: " + dir + File.separator + f.getName());
        }
    }
}

