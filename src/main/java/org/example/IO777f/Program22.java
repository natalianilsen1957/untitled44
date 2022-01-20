package org.example.IO777f;

import java.io.*;
import java.io.IOException;

public class Program22 {

    public static void main(String[] args) {
                try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data//person.dat")))
                {
                    Person10 p = new Person10("Sam", 33, 178, true);
                    oos.writeObject(p);
                }
                catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
        }
