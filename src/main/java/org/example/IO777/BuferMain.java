package org.example.IO777;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class BuferMain {

    public static void main(String[] args) throws Exception {

        try (FileReader reader1 = new FileReader(new File("data/data.txt"));
            BufferedReader bufferedReader = new BufferedReader(reader1)) {
            ArrayList<String> stringList = new ArrayList<>();
            bufferedReader.lines().forEach(stringList::add);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}