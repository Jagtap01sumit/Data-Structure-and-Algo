package Sorting_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_sort {
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array length");

        int n = sc.nextInt();
        System.out.println("Arrays Elements:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length - i - 1; k++) { //after iteration last element is sorted then in next iteration no neet to compare this
                if (arr[k] < arr[k + 1]) {
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }


            }
        }
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }


    }
}