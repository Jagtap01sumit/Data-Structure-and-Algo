package COLLECTION;

import java.util.Set;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        Set<Integer> c=new TreeSet<>();

        c.add(30);
        c.add(40);
        c.add(10);
        c.add(20);
        c.add(50);
        System.out.println(c); //element are in sorted form [10,20,30,40,50]
    }
}
