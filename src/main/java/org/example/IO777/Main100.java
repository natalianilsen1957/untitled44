package org.example.IO777;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main100 {

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream("C:\\untitled44\\src\\main\\java\\org\\example\\IO777\\rttr1.txt"));
        int n=0;
        while (n++<10) {

//            int x = System.in.read();
//            System.out.println(x);
//
//            int x2 = bufferedReader.read();
//            System.out.printf(" int x2=%d , char x2=%c   ", x2, (char) x2);

              int x3 = inputStreamReader.read();
              System.out.println(x3);
        }
        char x4 = 1071;
        System.out.println(x4);
    }
}