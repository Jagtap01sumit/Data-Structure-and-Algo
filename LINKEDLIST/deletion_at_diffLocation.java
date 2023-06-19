package LINKEDLIST;

import java.util.Scanner;

public class deletion_at_diffLocation {
    static class Node {
        int data;
        single_creation.Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    single_creation.Node head = null;

    public void creation() {
        int data;
        int n;

        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Enter the data");
            data = sc.nextInt();
            single_creation.Node new_node = new single_creation.Node(data);
            if (head == null) {
                head = new_node;
            } else {
                System.out.println("Enter 1 for insert element at beginning or Enter 2 for insert element at end or Enter 3 for specific location");
                int enter_no = sc.nextInt();
                switch (enter_no) {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;
                    case 2:
                        single_creation.Node temp = head;
                        while (new_node.next != null) {
                            temp = new_node.next;
                        }
                        temp.next = new_node;
                        new_node.next = null;
                        break;
                    case 3:
                        System.out.println("Enter the position");
                        int pos = sc.nextInt();
                        temp = head;
                        for (int i = 0; i < pos - 1; i++) {
                            temp = temp.next;
                        }
                        new_node.next = temp.next;
                        temp.next = new_node;
                        break;


                }

            }
            System.out.println("Do you want to continue?");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void traverse() {
        single_creation.Node temp = head;

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
                System.out.println("if you want to delete from beginning enter 1, for end delete 2 and for specific location enter 3:");
                n = sc.nextInt();
                switch (n) {
                    case 1:

                        single_creation.Node temp = head;
                        head = temp.next;

                        break;
                    case 2:
                        single_creation.Node ptr; //two pointer req temp and ptr
                        temp = head;
                        ptr = temp.next;
                        while (ptr.next != null) {
                            temp = ptr;
                            ptr = temp.next;

                        }
                        temp.next = null;


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

        l1.traverse();}
}
