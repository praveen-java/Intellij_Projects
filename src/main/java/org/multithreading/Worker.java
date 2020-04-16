package org.multithreading;

public class Worker {
    private int count =0;
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        worker.doWork();
    }

    private void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        increment(Thread.currentThread());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        increment(Thread.currentThread());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException exception){
            System.out.println("count = " + count);
        }
    }

    private synchronized void increment(Thread thread) throws InterruptedException {
        count++;
        Thread.sleep(100);
        System.out.println("The Thread :: "+thread.getName()+" count = " + count);
    }
}
