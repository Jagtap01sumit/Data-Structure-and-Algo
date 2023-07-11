package COLLECTION;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//list based on priority
public class priority_queue {
    public static void main(String[] args) {
        Queue <Integer> c=new PriorityQueue<>();
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

        System.out.println(c); //[20,40,30,50]

        Queue <Integer> l=new PriorityQueue<>(Comparator.reverseOrder());
        l.offer(10);
        l.offer(20);
        l.offer(30);
        l.offer(40);
        l.offer(50);
        System.out.println(l);  //reverse order of list

    }
}
