package org.example.A112;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class K1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin1=new FileInputStream("data/testin1.txt");
        FileInputStream fin2=new FileInputStream("data/testin2.txt");
        FileInputStream fin3=new FileInputStream("data/testin3.txt");
        FileInputStream fin4=new FileInputStream("data/testin4.txt");
        FileOutputStream out1=new FileOutputStream("data/testout.txt");
        Vector v=new Vector();
        v.add(fin1);
        v.add(fin2);
        v.add(fin3);
        v.add(fin4);
        Enumeration e =v.elements();
        SequenceInputStream sis=new SequenceInputStream(e);
        int i;
        while((i=sis.read())!=-1)
        {
            out1.write(i);
        }
        sis.close();
        fin1.close();
        fin2.close();
        fin3.close();
        fin4.close();

        System.out.println("Success..");
    }
}