package org.example.IO777f;

import java.io.Serializable;

class Person10 implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private double height;
    private boolean married;

    Person10(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMarried() {
        return married;
    }
}

