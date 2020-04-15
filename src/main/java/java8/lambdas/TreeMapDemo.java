package java8.lambdas;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> tm = new TreeMap<>();
        tm.put(100,"One Hundred");
        tm.put(200,"Two Hundreds");
        tm.put(300,"Three Hundreds");
        tm.put(400,"Four Hundreds");
        tm.put(500,"Five Hundreds");
        System.out.println("tm = " + tm);
    }
}
