package com.bgcoding.java.concurrency.synchronize;

public class MultipleMonitorObjects {

    private final Object monitor1 = new Object();
    private final Object monitor2 = new Object();

    private int counter1 = 0;
    private int counter2 = 0;

    // only 1 thread is allowed access at a time
    public void incCounter1() {
        synchronized (this.monitor1) {
            this.counter1++;
        }
    }

    public void incCounter2() {
        synchronized (this.monitor2) {
            this.counter2++;
        }
    }
}
