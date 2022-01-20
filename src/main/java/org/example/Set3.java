package org.example;

public class Set3 {
    public static void main(String[] args) {
        String st1 = "QWERTYUIOASDFGHJK";
        int ln1 = st1.length();
        String result = "";
        for (int i = ln1-1; i >=0; i--) {
            result += st1.charAt(i);
               }
        System.out.println(result);
        char[] charArray = st1.toCharArray();
        String st2=new StringBuilder(st1).reverse().toString();
        String st02=new StringBuilder(st1).reverse().toString();

        System.out.println(st2);

        String siteName = "prologisticqwerttrewertrewertrew.com.ua";
        String st3=siteName.substring(25);
        System.out.println(st3);

    }
}
