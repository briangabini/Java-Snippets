package com.bgcoding.java.concurrency.thread;

// 8. Stopping the execution of the thread by setting a flag
public class ThreadEx8 {

    public static class StoppableRunnable implements Runnable {

        private boolean stopRequested = false;

        // synchronized keyword on both methods ensures that they are synchronized on the same intrinsic lock (the instance of the StoppableRunnable class).
        // This means that only one thread can execute either of these methods at a time,
        // effectively using the same mutex for both methods.
        public synchronized void requestStop() {
            this.stopRequested = true;
        }

        public synchronized boolean isStopRequested() {
            return this.stopRequested;
        }

        private void sleep(long millis) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
//                Thread.currentThread().interrupt();
            }
        }

        @Override
        public void run() {
            System.out.println("StoppableRunnable running");
            while ( !isStopRequested() ) {
                sleep(1000);
                System.out.println("...");
            }
            System.out.println("StoppableRunnable stopped");
        }
    }

    public static void main(String[] args) {
        StoppableRunnable stoppableRunnable = new StoppableRunnable();
        Thread thread = new Thread( stoppableRunnable, "The Thread" );
        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("requesting stop");
        stoppableRunnable.requestStop();
        System.out.println("stop requested");
    }
}
