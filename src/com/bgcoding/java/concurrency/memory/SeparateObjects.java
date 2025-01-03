package com.bgcoding.java.concurrency.memory;

public class SeparateObjects {

    public static void main(String[] args) {
        MyObject myObject = new MyObject();

        Runnable runnable1 = new MyRunnable(myObject);
        Runnable runnable2 = new MyRunnable(myObject);

        Thread thread1 =
                new Thread(runnable1, "Thread 1");
        Thread thread2 =
                new Thread(runnable2, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
