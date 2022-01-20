package org.example.stream;
//https://annimon.com/article/2778
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class S1 {

    public static void main(String[] args) {
        File dir1 = new File("C://SomeDir");
// создаем объекты для файлов, которые находятся в каталоге
        File file1 = new File("C://SomeDir", "Hello.txt");
        File file2 = new File(dir1, "Hello2.txt");

    }
}