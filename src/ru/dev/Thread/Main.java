package ru.dev.Thread;

public class Main {
    public static void main(String[] args) {
        SomeThread t1 = new SomeThread("first");
        SomeThread t2 = new SomeThread("second");
        t1.start();
        t2.start();
    }
}
