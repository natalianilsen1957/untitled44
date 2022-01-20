package org.example.IO777;

import java.io.BufferedInputStream;

import java.io.BufferedWriter; import java.io.File; import java.io.FileInputStream; import java.io.FileNotFoundException; import java.io.FileOutputStream; import java.io.IOException;

import java.io.OutputStreamWriter; import java.io.UnsupportedEncodingException; //import java.nio.charset.StandardCharsets; import java.util.Arrays; import java.util.Random; import java.util.regex.Matcher; import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.Random;


//package epamtestfile;
//src/main/java/org/example/IO777

public class MainFileTest {
    public static void main(String[] args) {
        String path = "src/main/java/org/example/IO777/";
        String pathf = "src/main/java/org/example/IO777f/";
        String name = "rttr.txt";
        Filetest filetest = new Filetest(path, name);


        filetest.createFile();
//        filetest.(path1, name);
        filetest.fillRandom();
        filetest.replaceAll("src/main/java/org/example/IO777f/Filetest.java");
        filetest.polindrom("src/main/java/org/example/IO777f/Filetest.java");

    }
}