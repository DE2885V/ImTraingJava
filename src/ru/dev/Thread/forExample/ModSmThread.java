package ru.dev.Thread.forExample;

public class ModSmThread extends Thread {

    private String name;
    private String sm = "#";
    private int count = 0;

    ModSmThread(String n){
        name = n;
    }

    public void run(){
        while (count <  20){

            try {
                System.out.println(super.getName() + "/ " + name + ": " + sm);
                //Thread.sleep(25);
                ModSmThread.sleep(35);
                count++;
                sm += "#";

                //for (int i = 0; i < 5; i++)System.out.println();

            }catch (Exception e){}
        }

    }
}
