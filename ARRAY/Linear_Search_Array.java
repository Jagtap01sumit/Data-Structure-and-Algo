
public class Linear_Search_Array {

    public static void main(String[] args) {
        int[] arr = { 1, 56, 89, -23, 56, 0 };
        int ans = linearSerach(arr, 89);
        System.out.println(ans);

    }

    static int linearSerach(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        } else {
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] == target) {
                    return index;
                }
            }
        }
        return -1;

    }
}
