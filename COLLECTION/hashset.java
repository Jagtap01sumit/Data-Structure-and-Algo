package COLLECTION;

import java.util.HashSet;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        Set<Integer> c=new HashSet<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);
        System.out.println(c); //unorderd set

         int d=c.size();
        System.out.println(d);   //5

        System.out.println(c.contains(90));//false
    }
}
