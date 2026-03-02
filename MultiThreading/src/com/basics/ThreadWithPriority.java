package com.basics;

class TempThread extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted : "+ e);
        }
    }
}

public class ThreadWithPriority extends Thread{
    ThreadWithPriority(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            String a = "";
            for(int j = 0;j<10000;j++){
                a += "a";
            }
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
//        ThreadWithPriority t1 = new ThreadWithPriority("LOW PRIORITY THREAD");
//        ThreadWithPriority t2 = new ThreadWithPriority("MEDIUM PRIORITY THREAD");
//        ThreadWithPriority t3 = new ThreadWithPriority("HIGH PRIORITY THREAD");
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.NORM_PRIORITY);
//        t3.setPriority(Thread.MAX_PRIORITY);
//        t1.start();
//        t2.start();
//        t3.start();
        TempThread t = new TempThread();
        t.start();
        t.interrupt();
    }
}
