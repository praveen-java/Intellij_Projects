package org.multithreading.cyclicbarrier;

import org.multithreading.countdownlatch.Processor;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
            @Override
            public void run() {
                System.out.println("In Cyclic Barrier Run Method:: "+ Thread.currentThread().getName());
            }
        });

        Thread thread1 = new Thread(new CBTask(cyclicBarrier),"Thread 1");
        Thread thread2 = new Thread(new CBTask(cyclicBarrier),"Thread 2");
        Thread thread3 = new Thread(new CBTask(cyclicBarrier),"Thread 3");
        Thread thread4 = new Thread(new CBTask(cyclicBarrier),"Thread 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
