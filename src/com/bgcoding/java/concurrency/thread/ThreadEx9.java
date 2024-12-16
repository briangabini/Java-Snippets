package com.bgcoding.java.concurrency.thread;

public class ThreadEx9 {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            while(true) {
                sleep(1000);                // We cannot call Thread.sleep() directly if we do not handle the possible exception, so create a new method
                System.out.println("Running");
            }
        };

        Thread thread = new Thread( runnable );
        thread.setDaemon(true);                 // This will make the thread a daemon thread,
        // a daemon thread will not prevent the JVM from exiting when the program finishes
        thread.start();
        sleep(3100);
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
