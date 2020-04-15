package java8.lambdas;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(0);
        ts.add(5);
        ts.add(15);
        ts.add(1);
        System.out.println("ts = " + ts);
    }
}
