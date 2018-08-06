package ru.dev.Thread.forExample;

public class SomeThread extends Thread {

    private int count = 0;
    private String name;

    SomeThread(String n){
        name = n;
    }

    public void run(){
        while (count < 100) {
            try {
                System.out.println(name + ": " + count);    
                count++;
                Thread.sleep(250);
            } catch (Exception e) {
                System.out.println("Some error...");
            }
        }
    }
}
