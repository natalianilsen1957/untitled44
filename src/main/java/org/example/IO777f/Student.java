package org.example.IO777f;

import java.util.Objects;

public class Student {
    private String name;
    private Enum speciality;
    private int year;

    public Student(String name, Enum speciality, int year) {
        this.name = name;
        this.speciality = speciality;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Enum speciality) {
        this.speciality = speciality;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getYear() == student.getYear() && getName().equals(student.getName()) && getSpeciality().equals(student.getSpeciality());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSpeciality(), getYear());
    }

    @Override
    public String toString() {
        return "" +
                name + " :" +
                speciality + " " + year + "";
    }
}
