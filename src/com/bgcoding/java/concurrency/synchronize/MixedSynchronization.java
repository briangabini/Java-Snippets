package com.bgcoding.java.concurrency.synchronize;

public class MixedSynchronization {

    public static Object staticObj = null;

    public static synchronized void setStaticObj(Object o) {
        staticObj = o;
    }

    public Object instanceObj = null;

    public synchronized void setInstanceObj(Object obj) {
        this.instanceObj = obj;
    }
}
