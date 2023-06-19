import java.util.Scanner;

public class deletionin_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in array");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n - 1];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("");
        System.out.println("Enter the index where you want to delete the elememt");
        int ind = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i < ind) {
                arr2[i] = arr1[i];
            } else if (i == ind) {
                continue;
            } else {
                arr2[i - 1] = arr1[i];
            }
        }

        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
