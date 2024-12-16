package com.bgcoding.java.concurrency.thread;

import java.util.logging.Logger;

public class ThreadEx2 {

    private static final Logger logger = Logger.getLogger(ThreadEx2.class.getName());

    public static class MyThread extends Thread {
        @Override
        public void run() {
            logger.info("MyThread running");
            logger.info("MyThread finished");
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}