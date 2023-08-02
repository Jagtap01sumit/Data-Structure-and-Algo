package Searching_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

//array are sorted is compulusry
public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array length");
        int n = sc.nextInt();
        System.out.println("Arrays Elements:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.println("target:");
        int target = sc.nextInt();
        int start = 0;
        int end = n-1;
        int mid;
        mid = (start + end) / 2;
        while (start <= end) {
            if (arr[mid]== target) {
                System.out.println(mid);
                break;
            } else if (arr[mid] > target) {
                end = mid - 1;


            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                System.out.println("element is not present in array");
            }

        }


    }
}
