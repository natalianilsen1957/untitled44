package org.example.IO777;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class OutputName {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream1 = new FileOutputStream("data/out.txt", true)) {
            fileOutputStream1.write(48);
            byte [] value={65,67,100};
            fileOutputStream1.write(value);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}