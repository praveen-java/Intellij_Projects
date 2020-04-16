package org.multithreading.join;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WorkerMethodsSynchronized {
    private Random random = new Random();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public synchronized void stageOne(){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
    }

    public synchronized void stageTwo(){
            try{
                Thread.sleep(1);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
    }

    public void process(){
        for (int i = 0; i < 100; i++) {
            stageOne();
            stageTwo();
        }
    }
    public  void main() {
        System.out.println("Starting...");
        long start = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println(" Time Taken is :: " + (end - start) );

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
    }
}
