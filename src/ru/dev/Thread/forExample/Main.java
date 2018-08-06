package ru.dev.Thread.forExample;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Frm f= new Frm();

        System.out.println(new Random().nextInt(100));

        GrphSmThread t1 = new GrphSmThread("first");
        //GrphSmThread t2 = new GrphSmThread("second");
        //GrphSmThread t3 = new GrphSmThread("third");
        t1.start();
        //t2.start();
        //t3.start();
    }
}
