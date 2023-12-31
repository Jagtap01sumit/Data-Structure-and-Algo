package LINKEDLIST;

import java.util.Scanner;

public class deletion_at_diffLocation {
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
            while (temp != null) {
                System.out.println(temp.data);
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

                        Node temp = head;
                        head = temp.next;
                        tail.next = head;

                        break;
                    case 2:
                        Node ptr; // two pointer req temp and ptr
                        temp = head;
                        ptr = temp.next;
                        while (ptr.next != head) {
                            temp = ptr;
                            ptr = ptr.next;

                        }
                        temp.next = head;
                        temp = tail;

                        break;
                    case 3:
                        System.out.println("Enter the position:");
                        p = sc.nextInt();
                        temp = head;
                        ptr = temp.next;
                        for (int i = 0; i < p - 2; i++) {
                            temp = ptr;
                            ptr = ptr.next;
                        }
                        temp.next = ptr.next;
                        break;

                }
            }
            System.out.println("Do you want to delete continue?");
            m = sc.nextInt();

        } while (m == 1);
    }

    public static void main(String[] args) {
        deletion_at_diffLocation l1 = new deletion_at_diffLocation();
        l1.creation();
        l1.deletion();

        l1.traverse();
    }
}
