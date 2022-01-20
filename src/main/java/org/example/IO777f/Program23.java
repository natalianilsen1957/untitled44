package org.example.IO777f;

import java.io.*;
import java.io.IOException;

public class Program23 {

    public static void main(String[] args) {
                try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data//person.dat")))
                {
                    Person10 p=(Person10)ois.readObject();
                    System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
                }
                catch(Exception ex){

                    System.out.println(ex.getMessage());
                }
            }
        }