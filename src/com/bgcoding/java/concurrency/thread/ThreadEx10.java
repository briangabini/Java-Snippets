package com.bgcoding.java.concurrency.thread;

// 10. Daemon Threads w/ Thread.join()
public class ThreadEx10 {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                sleep(1000);
                System.out.println("Running");
            }
        };

        Thread thread = new Thread( runnable );
        thread.setDaemon(true);                 // This will make the thread a daemon thread,
        // a daemon thread will not prevent the JVM from exiting when the program finishes
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}

