package org.example.IO777f;

import java.io.*;
import java.io.IOException;

public class Program19 {

    public static void main(String[] args) {

                try(BufferedWriter bw = new BufferedWriter(new FileWriter("data//notes4.txt")))
                {
                    String text = "Hello  World!\nHey! Teachers! Leave them kids alone.";
                    bw.write(text);
                }
                catch(IOException ex){

                    System.out.println(ex.getMessage());
                }
        try(BufferedReader br = new BufferedReader (new FileReader("data//notes4.txt")))
        {
            // чтение посимвольно
            int c;
            while((c=br.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }
        }