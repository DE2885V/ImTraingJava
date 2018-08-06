package ru.dev.Thread.forExample;

import java.util.Random;

public class GrphSmThread extends Thread {

    private String name;
    private String sm = "#";
    private int count = 0;
    private int x = 25;
    private int y = new Random().nextInt(100);
    private Cnv ct;


    GrphSmThread(String n){
        name = n;
        ct = new Cnv();
    }

    public void run(){

        while (count <  20){

            ct.setX(x);
            ct.setY(y);

            x += 35;

            try {
                GrphSmThread.sleep(250);
                count++;

            }catch(Exception e){System.out.println("Error");}
        }

        System.out.println("Stop");
    }
}
