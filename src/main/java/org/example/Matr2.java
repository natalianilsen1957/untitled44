package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Matr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> numOld = new ArrayList<String>();
        while (sc.hasNextLine())
            numOld.add(sc.nextLine());
        int rowOld = numOld.size();//узнаем высоту исходной матрицы
        String[][] matrOld = new String[rowOld][];//создаем исходную матрицу нужной высоты
        for (int i = 0; i < rowOld; i++)//перегоняем ArrayList в исходную матрицу
            matrOld[i] = numOld.get(i).split(" ");
        int columnOld = matrOld[0].length;//узнаем ширину исходной матрицы

        String[][] matrNew = new String[columnOld][rowOld];//делаем финальную матрицу, перемещая элементы в циклах
        for (int i = 0; i < columnOld ; i++)
            for (int j = 0; j <rowOld ; j++)
                matrNew[i][j] = matrOld[j][rowOld - i - 1];
        for (String[] rowNewMatr : matrNew) //выводим на печать строки финальной матрицы, заменяя символы ,[] пробелами через регулярное выражение
            System.out.println(Arrays.toString(rowNewMatr).replaceAll("[\\Q,[]\\E]", ""));
    }
}
