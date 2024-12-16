package com.bgcoding.java.trywithresources;

public class AutoCloseableExample implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closing the resource inside AutoClosableExample");
    }
}
