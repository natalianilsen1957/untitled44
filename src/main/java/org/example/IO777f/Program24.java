package org.example.IO777f;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;

public class Program24 {
            //@SuppressWarnings("unchecked")
            public static void main(String[] args) {

                String filename = "data//people.dat";
                // создадим список объектов, которые будем записывать
                ArrayList<Person10> people = new ArrayList<Person10>();
                people.add(new Person10("Tom", 30, 175, false));
                people.add(new Person10("Sam", 33, 178, true));

                try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)))
                {
                    oos.writeObject(people);
                    System.out.println("File has been written");
                }
                catch(Exception ex){

                    System.out.println(ex.getMessage());
                }

                // десериализация в новый список
                ArrayList<Person10> newPeople= new ArrayList<Person10>();
                try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
                {

                    newPeople=((ArrayList<Person10>)ois.readObject());
                }
                catch(Exception ex){

                    System.out.println(ex.getMessage());
                }

                for(Person10 p : newPeople){
                    System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());}
            }
        }

