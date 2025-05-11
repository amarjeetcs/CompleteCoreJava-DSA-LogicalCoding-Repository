package com.threading;

class MyThread extends Thread {
    @Override
    public void run() {
        // Task to be executed by the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Value: " + i);
            try {
                Thread.sleep(1000);  // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class H {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread(); // Create thread object
        thread1.setName("Thread-1");
        thread1.start(); // Start the thread

        MyThread thread2 = new MyThread();
        thread2.setName("Thread-2");
        thread2.start();

        // Display the number of active threads and their details
        try {
            Thread.sleep(500); // Slight delay to ensure threads are running
            ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
            int activeThreads = Thread.activeCount();

            System.out.println("\nNumber of active threads: " + activeThreads);

            Thread[] threads = new Thread[activeThreads];
            threadGroup.enumerate(threads);

            System.out.println("Details of active threads:");
            for (Thread thread : threads) {
                System.out.println("Thread Name: " + thread.getName() + ", State: " + thread.getState());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
