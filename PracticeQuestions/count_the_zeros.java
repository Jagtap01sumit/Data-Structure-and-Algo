package PracticeQuestions;

import java.util.Scanner;

class count_zero {
    void count1() {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] strArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            strArray[i] = str.charAt(i);

        }

        int count = 0;
        for (int j = 0; j < strArray.length; j++) {

            if (strArray[j] == '0') {
                count = count + 1;

            }

        }
        System.out.println("The count of 0's is : ");
        System.out.println(count);

    }
}

public class count_the_zeros {
    public static void main(String[] args) {

        count_zero e = new count_zero();
        e.count1();


    }
}
