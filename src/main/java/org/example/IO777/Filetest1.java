package org.example.IO777;
//package org.example;


import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* * класс дл¤ заполнени¤ файла числами, замены public на private, и отзеркаливани¤ текста класса * */

public class Filetest1 {

    public String nameFile;
    public String path;
    public BufferedWriter bufW;
    public FileOutputStream fos;
    public OutputStreamWriter osw;
    private File file;

    // конструктор
    public Filetest1(String path, String nameFile) {

        this.path = path;
        this.nameFile = nameFile;

        this.file = new File(this.path, this.nameFile);

    }

    // метод создани¤ файла
    public void createFile () {
        try {
            boolean b = file.exists(); // проверка существует ли файл

            if(!b) {
                if(file.createNewFile()) {System.out.println("‘айл создан"+"\n File is create");}
            } else {
                System.out.println("‘айл уже создан");
                System.out.println(file.getAbsolutePath());
            }

        } catch (IOException e) {
            System.out.println("ќшибка создани¤ файла(метод createFile)");
            e.printStackTrace();
        }
    }

    // наполн¤ем файл рандомными числами от 0 - 100
    public void fillRandom() {
        Random ran = new Random();
        StringBuffer strB1 = new StringBuffer();


        for(int i = 0; i < 100;i++) {
            strB1.append(ran.nextInt(101));
            strB1.append(", ");
            if(i==100) {strB1.append(";");}
        }

        String str = strB1.toString();

        try {
            osw = new OutputStreamWriter(fos = new FileOutputStream(file), "UTF-8");
            bufW = new BufferedWriter(osw, 64);
            bufW.write(str+"\n");
            bufW.flush();
        } catch (IOException e) {
            System.out.println("ќшибка записи в файл метод fillRandom 1");
            e.printStackTrace();
        }

        String [] strMas = str.split("(, )|(;)");
        int [] intMas = new int [strMas.length];

        System.out.println(Arrays.toString(strMas)); //пров

        for (int i = 0; i<strMas.length; i++) { // переброс с преоброзованием
            intMas[i] = Integer.parseInt(strMas[i]);
        }

        Arrays.sort(intMas); // сортировка массива

        strB1 = null;
        StringBuffer strB2 = new StringBuffer();

        for(int r : intMas) {
            strB2.append(r);
            strB2.append(", ");
        }
        strB2.append(";\r\n");

        try {
            bufW.write(strB2.toString());
            bufW.flush();
            bufW.close();
        } catch (IOException e) {
            System.out.println("ќшибка записи в файл метод fillRandom 2");
            e.printStackTrace();
        }

    }

    // метод дл¤ разворота текста файла
    public void polindrom(String pathf) {
        StringBuffer strbuf = new StringBuffer();

        try(BufferedInputStream buf2 = new BufferedInputStream(new FileInputStream(pathf), 64)){
            byte [] bytemas = new byte [64];

            while(buf2.available() != 0) {
                bytemas = buf2.readAllBytes();

                strbuf.append(new String(bytemas));
            }

            strbuf.reverse();

            //System.out.println(strbuf); //пров

            BufferedWriter bufW2 = new BufferedWriter(new OutputStreamWriter( new FileOutputStream("src/report/polindrom.txt", true)), 64);

            bufW2.write("\n"+strbuf.toString()+"\n");
            bufW2.flush();

            bufW2.close();


        }catch(FileNotFoundException e) {
            System.out.print("ќшибка метод polindrom 1");
            e.printStackTrace();
        }catch(IOException e) {
            System.out.print("ќшибка метод polindrom 2");
            e.printStackTrace();
        }


    }


    // метод дл¤ замены public на private методах и пол¤х класса
    public void replaceAll(String path) {
        File file2 = new File(path);
        StringBuffer strb = new StringBuffer();

        try(BufferedInputStream buf2 = new BufferedInputStream(new FileInputStream(file2), 64)){
            //BufferedReader buf2 = new BufferedReader(new InputStreamReader(
            //new FileInputStream(file2)), 64)
            byte [] bytemas = new byte [64];


            while(buf2.available() != 0) {
                bytemas = buf2.readAllBytes();

                strb.append(new String(bytemas));
            }


            //String str1 = strb.toString();

            //System.out.println(str1); // пров

            Pattern pat = Pattern.compile("public\s[^c&^F]");
            Matcher mat = pat.matcher(strb);

            while(mat.find()) {
                int s = mat.start();
                int e = mat.end();

                strb.replace(s, (e-2), "private");

            }

            //System.out.println(strb); // пров

            BufferedWriter bufW2 = new BufferedWriter(new OutputStreamWriter( new FileOutputStream("src/report/report.txt", true)), 64);

            bufW2.write("\n"+strb.toString()+"\n");
            bufW2.flush();

            bufW2.close();


        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }    }
}
