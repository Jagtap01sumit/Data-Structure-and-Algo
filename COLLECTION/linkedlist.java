package COLLECTION;

import java.util.LinkedList;
//Linked List in collection is same as a arrayList

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> c=new LinkedList<>();
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
