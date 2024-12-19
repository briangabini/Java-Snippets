package com.bgcoding.java.concurrency.virtualthreads;

import java.util.ArrayList;
import java.util.List;

public class VirtualThreadEx2 {

    public static void main(String[] args) {

        List<Thread> vThreads = new ArrayList<>();

        final int VIRTUAL_THREAD_COUNT = 100_000;

        for (int i = 0; i < VIRTUAL_THREAD_COUNT; i++) {
            int vThreadIndex = i;
            Thread vThread = Thread.ofVirtual().start(() -> {
                int result = 1;
                for (int j = 0; j < 10; j++) {
                    result *= (j + 1);
                }
                System.out.println("Result[" + vThreadIndex + "]: " + result);
            });

            vThreads.add(vThread);
        }

        for (Thread vThread : vThreads) {
            try {
                vThread.join();
            } catch (InterruptedException e) {
                vThread.interrupt();
                throw new RuntimeException(e);
            }
        }
    }
}
