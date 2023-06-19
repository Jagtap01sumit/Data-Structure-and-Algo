import java.util.*;

public class Linear_Search_Array_for_String {
    public static void main(String[] args) {

        String str = "sumit";
        char target = 'm';
        System.out.println(str.toCharArray());
        System.out.println(Arrays.toString(str.toCharArray()));
        linearSearchChar(str, target);
    }

    static boolean linearSearchChar(String str, char target) {
        if (str.length() == 0) {
            return false;

        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == target) {
                    return true;
                }
            }
        }
        return false;
    }
}