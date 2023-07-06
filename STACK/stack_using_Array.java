package STACK;

import java.util.Scanner;

public class stack_using_Array {
    static class stack {
        Scanner sc = new Scanner(System.in);
        int top = -1;
        int n = 10;
        int a[] = new int[n];

        void push() {

            if (top == n - 1) {
                System.out.println("overfloww the stack");
            } else {
                System.out.println("Enter the element:");
                int ele = sc.nextInt();
                top = top + 1;
                a[top] = ele;
                System.out.println("Element inserted");

            }
        }

        void pop() {
            if (top == -1) {
                System.out.println("stack is underfloww");
            } else {
                top = top - 1;
                System.out.println("Element is deleted");
            }
        }

        void display() {
            System.out.println("Element are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(a[i]);
            }
        }

    }

    public static void main(String[] args) {
        stack l1 = new stack();
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
                    l1.push();
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
