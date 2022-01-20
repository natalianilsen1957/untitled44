package org.example.IO777f;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

public class Program02 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alex", Speciality.Physics, 1),
                new Student("Rika", Speciality.Biology, 4),
                new Student("Julia", Speciality.Biology, 2),
                new Student("Steve", Speciality.History, 4),
                new Student("Mike", Speciality.Finance, 1),
                new Student("Hinata", Speciality.Biology, 2),
                new Student("Richard", Speciality.History, 1),
                new Student("Kate", Speciality.Psychology, 2),
                new Student("Sergey", Speciality.ComputerScience, 4),
                new Student("Maximilian", Speciality.ComputerScience, 3),
                new Student("Tim", Speciality.ComputerScience, 5),
                new Student("Ann", Speciality.Psychology, 1)
        );
        boolean as1 = students.stream()
                .filter(s -> s.getSpeciality()!=Speciality.ComputerScience && s.getSpeciality()!=Speciality.Physics)
                        .anyMatch(s -> s.getYear() == 1);
        System.out.println(as1);
    }}