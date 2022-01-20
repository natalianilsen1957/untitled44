package org.example.IO777f;

import java.io.IOException;
import java.io.*;

public class Program16 {

    public static void main(String[] args) {


        Person11 tom = new Person11("Tom", 34, 1.68, false);
        // запись в файл
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data//data15.bin"))) {
            // записываем значения
            dos.writeUTF(tom.name);
            dos.writeInt(tom.age);
            dos.writeDouble(tom.height);
            dos.writeBoolean(tom.married);
            System.out.println("File has been written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        // обратное считывание из файла
        try (DataInputStream dos = new DataInputStream(new FileInputStream("data//data15.bin"))) {
            // записываем значения
            String name = dos.readUTF();
            int age = dos.readInt();
            double height = dos.readDouble();
            boolean married = dos.readBoolean();
            System.out.printf("Name: %s  Age: %d  Height: %f  Married: %b",
                    name, age, height, married);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


