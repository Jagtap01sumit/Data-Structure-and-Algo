package LINKEDLIST;

import java.util.Scanner;

public class circuler_LL_insertion_diffLocation {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

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
                new_node.next = head;

            } else {
                System.out.println(
                        "Enter 1 for insert element at beginning or Enter 2 for insert element at end or Enter 3 for specific location");
                int enter_no = sc.nextInt();
                switch (enter_no) {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        tail.next = head;
                        break;
                    case 2:
                        tail.next = new_node;
                        tail = new_node;
                        new_node.next = head;
                        break;
                    case 3:
                        System.out.println("Enter the position");
                        int pos = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < pos - 1; i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;

                }

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
            do {
                System.out.println(temp.data + " ");
                temp = temp.next;
            } while (temp != head);

        }

    }

    public static void main(String[] args) {
        circuler_LL_insertion_diffLocation l1 = new circuler_LL_insertion_diffLocation();
        l1.creation();
        l1.traverse();
    }
}
