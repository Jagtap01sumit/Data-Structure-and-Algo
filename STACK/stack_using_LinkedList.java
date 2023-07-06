package STACK;

import LINKEDLIST.single_creation;

import java.util.Scanner;

class stack1 {
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    Node top = null;      //head/top

    void push(Scanner sc) {
        System.out.println("Enter the data:");
        int data = sc.nextInt();
        Node new_node = new Node(data);
        //there is no overflow condition because there is no predefine size of LL
        if (top == null) {
            top = new_node;

        } else {
            new_node.next = top;
            top = new_node;
        }

    }


    void pop() {
        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            Node temp = top;
            top = temp.next;
        }

    }

    void display() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}

public class stack_using_LinkedList {

    public static void main(String[] args) {
        stack1 l1 = new stack1();
        Scanner sc = new Scanner(System.in);
        int l;


        do {
            System.out.println("Enter 1 for push the element");
            System.out.println("Enter 2 for pop the element");
            System.out.println("Enter 3 for display the element");
            System.out.println("Enter your choose:");
            int j = sc.nextInt();
            switch (j) {
                case 1:
                    l1.push(sc);
                    break;

                case 2:
                    l1.pop();
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
