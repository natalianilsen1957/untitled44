package org.example.IO777;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLReader {
    public static void main(String[] args) throws Exception {

        URL oracle2 = new URL("https://www.oracle.com/index.html");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle2.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null){
            System.out.println(inputLine);}
        in.close();
    }
}