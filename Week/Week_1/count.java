package Week.Week_1;
/*
Question 2
Given a permutation of first N natural numbers as an array A[ ]. Your task is to sort the array in exactly two swaps.
If It is possible to sort the array then return True otherwise return False.
Note: You can swap same pair of index two times. Also you cannot perform swap if you have only one element.

Input:
N = 4
A[] = {4, 3, 2, 1}
Output: Yes
Explanation:
swap(A[1], A[4]), now A[] = {1, 3, 2, 4}
swap(A[2], A[3]), now A[] = {1, 2, 3, 4}
*/

public class count {

    public static int countPairs(int[] nums, int x, int y) {
        int count = 0;
        int n = nums.length;

        // Nested loop to check all pairs (i, j) with i < j
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                if (x <= product && product <= y) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int nums[] = {3, 5, 5, 2, 6};
        int x = 8, y = 13;
        int result = countPairs(nums, x, y);
        System.out.println("Total number of pairs: " + result);
    }
}
