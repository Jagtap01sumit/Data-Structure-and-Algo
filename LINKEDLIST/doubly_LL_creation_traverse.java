package LINKEDLIST;

import java.util.Scanner;

public class doubly_LL_creation_traverse {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }

    Node head = null;
    Node tail = null;

    public void creation() {
        int data;
        int n;

        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Enter the data");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail = new_node;
            } else {
                head.prev = new_node;
                new_node.next = head;
                head = new_node;

            }
            System.out.println("Do you want to continue?");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void traverse() {
        Node temp = head;

        // Node new_node = new Node(data);

        if (head == null) {
            System.out.println("There is no LinkedList");

        } else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }

        }

    }

    public static void main(String[] args) {
        single_creation l1 = new single_creation();
        l1.creation();
        l1.traverse();
    }
}
