package org.example.IO777f;

import java.io.*;
import java.io.IOException;

public class Program17 {

    public static void main(String[] args) {
                try(FileWriter writer = new FileWriter("data//notes13.txt", false))
                {
                    // запись всей строки
                    String text = "Hello Gold!";
                    writer.write(text);
                    // запись по символам
                    writer.append('\n');
                    writer.append('E');

                    writer.flush();
                }
                catch(IOException ex){

                    System.out.println(ex.getMessage());
                }
            }
        }