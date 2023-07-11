package COLLECTION;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class linkedhashset {
    public static void main(String[] args) {
        Set<Integer> c=new LinkedHashSet<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);
        System.out.println(c); //ordered set[10,20,30,40,50]  no duplication




    }
}
