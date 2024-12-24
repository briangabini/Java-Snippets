package com.bgcoding.java.concurrency.synchronize;

public class Reentrance {

    private int count = 0;

    public synchronized void inc() {
        this.count++;
    }

    public synchronized int incAndGet() {
        inc();                  // if a synchronized method calls another synchronized block, it will allow access
        return this.count;
    }
}
