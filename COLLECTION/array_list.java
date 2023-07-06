package COLLECTION;

import java.util.ArrayList;
import java.util.List;

public class array_list {
    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        System.out.println(c);   //10 20 30 40

        c.remove(2);
        System.out.println(c);      //10 20 40

        int d = c.get(2);
        System.out.println(d);   //40

//      c.clear();
        System.out.println(c);   //[ ]

//     int f=c.get(1,90);
//        System.out.println(f);

        boolean m = c.contains(10);
        System.out.println(m);
    }
}
