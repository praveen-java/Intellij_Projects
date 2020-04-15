package java8.lambdas;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(0);
        l.add(5);
        l.add(14);
        l.add(20);
        System.out.println("l Before Sorting = " + l);
        Collections.sort(l,(l1, l2)->(l1<l2)?1:(l1>l2)?-1:0);
//        Collections.sort(l);
        System.out.println("l Before Sorting = " + l);
    }
}
