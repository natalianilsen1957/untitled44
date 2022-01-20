package org.example.IO777f;

import java.io.*;
import java.io.IOException;

    public class Program18 {
        public static void main(String[] args) {
            try(FileReader reader = new FileReader("data//in.txt"))
            {
                // читаем посимвольно
                int c;
                while((c=reader.read())!=-1){

                    System.out.print((char)c);
                }
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
        }
    }