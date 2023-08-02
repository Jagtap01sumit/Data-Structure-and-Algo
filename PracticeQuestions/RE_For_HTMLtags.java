package PracticeQuestions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE_For_HTMLtags {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Number of test Case:");
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            System.out.println("Enter the tag:");     //<h1>any text</h1>
            String line = in.nextLine();


            Pattern pattern = Pattern.compile("<([^<>/]+)>([^<>]+)</(\\1)>");
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                System.out.println(matcher.group(2));
                while (matcher.find()) {
                    System.out.println(matcher.group(2));
                }
            } else {
                System.out.println("None");
            }

            testCases--;
        }
    }
}




