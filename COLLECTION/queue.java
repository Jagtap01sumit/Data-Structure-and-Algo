package COLLECTION;

import java.util.LinkedList;
import java.util.Queue;
//queue using LinkedList
public class queue {
    public static void main(String[] args) {
        Queue<Integer> c=new LinkedList<>();
        c.offer(10);
        c.offer(20);
        c.offer(30);
        c.offer(40);
        c.offer(50);
        System.out.println(c);// [10,20,30,40,50]

        int d=c.peek();  //10
        System.out.println(d);

        int p=c.poll();       //10 deleted
        System.out.println(p);

        System.out.println(c); //[20.....50]




    }
}
