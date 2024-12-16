package com.bgcoding.java.concurrency.thread;

public class ThreadEx5 {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Lambda running");
            System.out.println("Lambda finished");
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
