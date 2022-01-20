package org.example.IO777f;

import java.io.*;

public class Program15 {

    public static void main(String[] args) {
        try (PrintStream printStream = new PrintStream("data//notes3.txt")) {
            printStream.print("Hello World!\n");
            printStream.println("Welcome to Java!");

            printStream.printf("Name: %s Age: %d \n", "Tom", 34);

            String message = "PrintStream";
            byte[] message_toBytes = message.getBytes();
            printStream.write(message_toBytes);

            System.out.println("The file has been written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        try (PrintWriter pw = new PrintWriter("data//notes4.txt")) {
            pw.println("Hello world!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}