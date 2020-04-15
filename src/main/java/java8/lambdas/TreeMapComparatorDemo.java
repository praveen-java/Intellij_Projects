package java8.lambdas;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapComparatorDemo {
    public static void main(String[] args) {
        Map<Integer,String> tm = new TreeMap<>((l1,l2)->(l1<l2)?1:(l1>l2)?-1:0);
        tm.put(100,"One Hundred");
        tm.put(200,"Two Hundreds");
        tm.put(300,"Three Hundreds");
        tm.put(400,"Four Hundreds");
        tm.put(500,"Five Hundreds");
        System.out.println("tm = " + tm);
    }
}
