package org.multithreading.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Processor implements Runnable{
    private CountDownLatch countDownLatch;

    public Processor(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Started..."+Thread.currentThread().getName());
        System.out.println("The current Count is :: "+countDownLatch.getCount());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countDownLatch.countDown();
    }
}
