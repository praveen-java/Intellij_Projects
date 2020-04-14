package org.multithreading;

import java.util.Arrays;

class Runner extends Thread{
    @Override
    public void run(){
        System.out.println("This is in run Method:: "+Thread.currentThread().getName()+" in "+Thread.currentThread().getContextClassLoader()
        +" thread group::"+Thread.currentThread().getThreadGroup());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class ApplicationRunnable {
    public static void main(String[] args) {
        Runner runnerobj = new Runner();
        runnerobj.start();
        Runner runner = new Runner();
        runner.start();
        System.out.println("In the Main Thread.... = " + Thread.currentThread().getName());
    }
}
