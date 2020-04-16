package java8.volatiledemo;


import java.util.Scanner;

class Processor extends Thread{
    private volatile boolean running = true;
    public void run(){
        while(running){
            System.out.println("Running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void shutdown(){
        running = false;
    }
}
public class VolatileDemo {
    public static void main(String[] args) {
       Processor processor = new Processor();
       processor.start();
       System.out.println("Please wait until enter pressed...");
       new Scanner(System.in).nextLine();
       processor.shutdown();
    }
}
