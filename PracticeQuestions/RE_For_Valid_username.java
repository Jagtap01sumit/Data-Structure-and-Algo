package PracticeQuestions;

import java.util.Scanner;





class UsernameValidator {
    public static final String regularExpression = "^([a-zA-Z][a-zA-Z0-9_]{7,29})$";//RE for validation of username, not password
}

public class RE_For_Valid_username {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Number of test Cases");
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            System.out.println("Enter the number of usernames to validate:");
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

