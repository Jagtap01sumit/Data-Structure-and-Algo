package Searching_Algorithms;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;


        System.out.println("Enter the length of array:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you wnat to search:");
        int a = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == a) {
                System.out.println("This element at index " + i);
            }
        }
    }
}
