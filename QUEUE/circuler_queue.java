package QUEUE;

import java.util.Scanner;

class queue2 {
    Scanner sc = new Scanner(System.in);
    int f= -1,r=-1;
    int n = 4;
    int a[] = new int[n];

    void enqueue() {

        if (f == (r+1)%n) {
            System.out.println("overfloww the queue");
        } else {
            System.out.println("Enter the element:");
            int i=sc.nextInt();

            if(f==-1 && r==-1){
                f=0;
                r=0;
                a[r]=i;
            }else{
                r=(r+1)%n;
                a[r]=i;
            }
        }
    }

    void dequeue() {
        if (f==-1 && r==-1 || f==r) {
            System.out.println("Queue is underfloww");
        } else {
            f=(f+1)%n;
        }
    }

    void display() {
        int i;
        System.out.println("Element are:");
        for ( i =f; i !=r;i=(i+1)%n){
            System.out.println(a[i]);
        }
        System.out.println(a[i]);
    }
}

public class circuler_queue {
    public static void main(String[] args) {
        queue2 l1 = new queue2();
        Scanner sc = new Scanner(System.in);
        int l;


        do {
            System.out.println("Enter 1 for Enqueue the element");
            System.out.println("Enter 2 for Dequeue the element");
            System.out.println("Enter 3 for display the element");
            System.out.println("Enter your choose:");
            int j = sc.nextInt();
            switch (j) {
                case 1:
                    l1.enqueue();
                    break;

                case 2:
                    l1.dequeue();
                    break;
                case 3:
                    l1.display();
                    break;
            }
            System.out.println("Enter 0 for contineu");
            l = sc.nextInt();
        }

        while (l == 0);
        System.out.println("Exited");

    }

}
