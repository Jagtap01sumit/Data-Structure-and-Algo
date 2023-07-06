package QUEUE;

import java.util.Scanner;

class queue1 {
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    Node f = null;      //head/f
    Node r = null;      //tail/r

    void enqueue(Scanner sc) {
        System.out.println("Enter the data:");
        int data = sc.nextInt();
        Node new_node = new Node(data);
        if (f == null) {
            r = new_node;
            f = new_node;

        } else {
            r.next = new_node;
            r = new_node;
        }

    }

    void dequeue() {
        if (f == null) {
            System.out.println("queue is empty");
        } else {
            f = f.next;
        }
    }

    void display() {
Node temp;
temp=f;
while(temp!=null){
    System.out.print(temp.data+" ");
    temp=temp.next;
}

    }


}

public class queue_using_LL {
    public static void main(String[] args) {
        queue1 l1 = new queue1();
        Scanner sc = new Scanner(System.in);
        int l;


        do {
            System.out.println("Enter 1 for enqueue the element");
            System.out.println("Enter 2 for dequeue the element");
            System.out.println("Enter 3 for display the element");
            System.out.println("Enter your choose:");
            int j = sc.nextInt();
            switch (j) {
                case 1:
                    l1.enqueue(sc);
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

