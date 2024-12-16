package com.bgcoding.java.concurrency.thread;

public class ThreadEx4 {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {                    // anonymous class
            @Override
            public void run() {
                System.out.println("MyRunnable running");
                System.out.println("MyRunnable finished");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
