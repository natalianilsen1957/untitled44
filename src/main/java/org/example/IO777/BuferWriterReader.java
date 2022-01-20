package org.example.IO777;

import java.io.*;

public class BuferWriterReader {

    public static void main(String[] args) throws Exception {

        try (FileReader reader1 = new FileReader(new File("data/data.txt"));
             BufferedReader bufferedReader = new BufferedReader(reader1);
             FileWriter writer1 = new FileWriter("data/result.txt", true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer1)) {
             String line = null;
             while ((line =bufferedReader.readLine()) !=null){
             bufferedWriter.write(line,0, line.length());
             bufferedWriter.newLine();
             }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}