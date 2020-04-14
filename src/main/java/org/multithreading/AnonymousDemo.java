package org.multithreading;

public class AnonymousDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable(){
            public void run(){
                for (int i = 0; i < 10; i++) {
                    System.out.println("The name of the thread is :: "+Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }     
            }
        });
        thread1.start();

        System.out.println("Current thread is Main:"+Thread.currentThread().getName());
    }
}
