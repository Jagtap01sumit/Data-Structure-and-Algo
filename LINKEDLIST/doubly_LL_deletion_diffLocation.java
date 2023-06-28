package LINKEDLIST;

import java.util.Scanner;

public class doubly_LL_deletion_diffLocation {
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
                System.out.println(
                        "Enter 1 for insert element at beginning or Enter 2 for insert element at end or Enter 3 for specific location");
                int enter_no = sc.nextInt();
                switch (enter_no) {
                    case 1:
                        new_node.next = head;
                        head.prev = new_node;
                        head = new_node;
                        break;
                    case 2:
                        tail.next = new_node;
                        new_node.prev = tail;
                        tail = new_node;
                        break;
                    case 3:
                        System.out.println("Enter the position");
                        int pos = sc.nextInt();
                        Node temp1 = head;
                        Node ptr = temp1.next;
                        for (int i = 1; i < pos - 1; i++) {
                            temp1 = ptr;
                            ptr = ptr.next;
                        }
                        new_node.prev = temp1;
                        new_node.next = ptr;
                        temp1.next = new_node;
                        ptr.prev = new_node;
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
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

        }

    }

    public void deletion() {
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);
        do {
            if (head == null) {
                System.out.println("Linked list is not available");
            } else {
                System.out.println(
                        "if you want to delete from beginning enter 1, for end delete 2 and for specific location enter 3:");
                n = sc.nextInt();
                switch (n) {
                    case 1:

                        Node temp0 = head;
                        temp0 = temp0.next;

                        head = temp0;
                        head.prev = null;

                        break;
                    case 2:

                        Node temp6 = tail;
                        temp6 = temp6.prev;
                        temp6.next = null;


                        break;
                    case 3:
                        Node ptr1;
                        Node temp2;
                        System.out.println("Enter the position:");
                        p = sc.nextInt();
                        temp2 = head;
                        ptr1 = temp2.next;
                        for (int i = 0; i < p - 2; i++) {
                            temp2 = ptr1;
                            ptr1 = ptr1.next;

                        }
                        temp2.next = ptr1.next;
                        ptr1.next.prev = temp2;
                        break;

                }
            }
            System.out.println("Do you want to delete continue?");
            m = sc.nextInt();

        } while (m == 1);
    }

    public static void main(String[] args) {
        doubly_LL_deletion_diffLocation l1 = new doubly_LL_deletion_diffLocation();
        l1.creation();
        l1.deletion();
        l1.traverse();
    }
}
