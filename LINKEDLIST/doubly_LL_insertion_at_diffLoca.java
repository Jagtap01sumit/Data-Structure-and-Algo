package LINKEDLIST;

import java.util.Scanner;

public class doubly_LL_insertion_at_diffLoca {
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
                System.out.print(temp.data+" ");
                temp = temp.next;
            }

        }

    }

    public static void main(String[] args) {
        doubly_LL_insertion_at_diffLoca l1 = new doubly_LL_insertion_at_diffLoca();
        l1.creation();
        l1.traverse();
    }
}
