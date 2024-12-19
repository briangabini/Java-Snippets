package com.bgcoding.java.concurrency.virtualthreads;

public class VirtualThreadEx1 {

    public static void main(String[] args) {

        // Ex 1: Create Runnable. Create and Start Virtual Thread
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Index: " + i);
            }
        };

        Thread vThread1 = Thread.ofVirtual().start(runnable);


        // Ex 2: Create but do not start virtual thread
        Thread vThreadUnstarted = Thread.ofVirtual().unstarted(runnable);

        // Start the virtual thread
        vThreadUnstarted.start();

        // Ex 3: How to join a virtual thread
        try {
            vThreadUnstarted.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
