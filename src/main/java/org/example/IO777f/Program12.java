package org.example.IO777f;

import java.io.*;
import java.io.IOException;

public class Program12 {

    public static void main(String[] args) {
                String text = "Hello world!";
                byte[] buffer = text.getBytes();

                ByteArrayInputStream in = new ByteArrayInputStream(buffer);
                try(BufferedInputStream bis = new BufferedInputStream(in)){

                    int c;
                    while((c=bis.read())!=-1){

                        System.out.print((char)c);
                    }
                }
                catch(Exception e){

                    System.out.println(e.getMessage());
                }
                System.out.println();
            }
        }