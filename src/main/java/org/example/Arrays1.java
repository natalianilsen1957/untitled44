package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arrays1 {
    public static void main(String[] args) {
        String[] arr1 = "kkk0 rtyu0 fgh0 gfgh0".split(" ");
        String[] arr2 = "kkk fgh rtyu fgh gfgh".split(" ");
        int [][] arr3={{1,2,3},{4,5,6},{7,8,9}};

//        ArrayList<ObjElement> arrayList = new ArrayList<ObjElement>(Arrays.asList(arrayOfObjects)); ArrayList<ObjElement> arrayList =
        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(arrayList1);
        arr1[0]="ZZZZZZZZZZZZZZ";
        System.out.println(arrayList1);
        System.out.println("_______________________________________________________________________________________________________________");
        arr1[0]="kkk0";

        List<String> listofObjects1 = Arrays.asList(arr1);
        System.out.println(listofObjects1);
        arr1[0]="ZZZZZZZZZZZZZZ";
        System.out.println(listofObjects1);
        System.out.println("_______________________________________________________________________________________________________________");
        arr1[0]="kkk0";

        List<String> listOfObjects2 = new ArrayList<>(5);
//        List<String> listOfObjects2 = new ArrayList<>(arr1.length);

        Collections.addAll(listOfObjects2, arr1);
        Collections.addAll(listOfObjects2, arr1);
        Collections.addAll(listOfObjects2, arr1);
        System.out.println(listOfObjects2);
        arr1[0]="ZZZZZZZZZZZZZZ";
        System.out.println(listOfObjects2);
        System.out.println("_______________________________________________________________________________________________________________");
        arr1[0]="kkk0";


    }
}
