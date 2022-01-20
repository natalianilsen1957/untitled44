package org.example.IO777f;

import java.io.*;

public class Program21 {

    public static void main(String[] args) {


        try(BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter("data//notes5.txt")))
        {
            // чтение построчно
            String text;
            while(!(text=br.readLine()).equals("ESC")){

                bw.write(text + "\n");
                bw.flush();
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}