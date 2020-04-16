package org.multithreading.join;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BasicLocking {
    public static void main(String[] args) {
        System.out.println("Synchronized Objects.");
        Worker worker = new Worker();
        worker.main();
        System.out.println("Synchronized Methods.");
        WorkerMethodsSynchronized workerMethodsSynchronized = new WorkerMethodsSynchronized();
        workerMethodsSynchronized.main();
    }
}
