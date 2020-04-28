package org.multithreading.executordemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Worker implements Runnable{
    private Random random = new Random();

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public List<Integer> list1 = new ArrayList<>();
    public List<Integer> list2 = new ArrayList<>();

    public void run(){
        process();
    }

    private void process() {
        for (int i = 0; i < 100; i++) {
            stageOne();
            stageTwo();
        }
    }

    private void stageTwo() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list1.add(random.nextInt(100));
    }

    private void stageOne() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list2.add(random.nextInt(100));
    }
}
public class ExecutorWorkerDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        long start = System.currentTimeMillis();
        Worker worker = new Worker();
        for (int i = 0; i < 2; i++) {
            executorService.submit(worker);
        }
        executorService.shutdown();

        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("execution time = " + (end - start));
        System.out.println("list1 = " + worker.list1);
        System.out.println("list2 = " + worker.list2);
    }
}
