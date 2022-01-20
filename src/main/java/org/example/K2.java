package org.example;

import java.util.HashMap;
import java.util.*;
import java.util.stream.Collectors;

public class K2 {
    public static void main(String[] args) {
        Employee a1 = new Employee(1, "N1", "P1");
        Employee a2 = new Employee(2, "N2", "P2");
        Employee a3 = new Employee(3, "N3", "P1");
        Employee a4 = new Employee(4, "N4", "P3");
        Employee a5 = new Employee(5, "N5", "P3");
        Employee a6 = new Employee(6, "N6", "P3");
        List<Employee> lsEmp = new ArrayList<>();
        Collections.addAll(lsEmp, a1, a2, a3, a4, a5, a6);
        Map<String, List<Employee>> map1 = lsEmp.stream().collect(Collectors.groupingBy(Employee::getProf));
        System.out.println(map1);
        System.out.println(map1.entrySet());
        System.out.println(map1.values());
        System.out.println(map1.keySet());
        System.out.println(map1.get("P1"));


    }}

