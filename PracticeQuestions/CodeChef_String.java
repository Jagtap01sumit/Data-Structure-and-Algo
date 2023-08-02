package PracticeQuestions;

import java.util.Scanner;
/*
Question:
we take input a string
and guess the string
if the charater is match then output is "G" other wise its a "B"
*/


public class CodeChef_String {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter test NO. of test Cases:");
        int t = sc.nextInt();
        while (t != 0) {
            System.out.println("Enter the word String");
            String word = sc.next();
            System.out.println("Guess the string:");
            String guess = sc.next();
            String newWord;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess.charAt(i)) {

                    System.out.print("G");

                } else {
                    System.out.print("B");
                }

            }


            t--;
        }
    }
}
