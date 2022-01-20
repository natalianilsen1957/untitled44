package org.example.A111;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
//    MyThread myThread=new MyThread();
//    myThread.start();
//     Thread thread1=new Thread((new Runner()));
//     thread1.start();
        System.out.println("main");
        MyThread thread2 = new MyThread();
        thread2.start();
        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();
        thread2.shutdown();
        System.out.println("FGHJ");




    }
}

class Runner implements Runnable {
    @Override
    public void run() {
        System.out.println("runner");
    }
}


class MyThread extends Thread {
    private volatile boolean str = true;

    public void shutdown() {
        this.str = false;
    }


    @Override
    public void run() {
        while (str) {
            System.out.println("MyThread");
        }
    }
}

