package PracticeQuestions;

import java.util.Scanner;
/*
IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed.
The length of A, B, C, or D can't be greater than 3.
*/

public class RE_IP_address_validation {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){   //hasNext() means whenever inpute is taken
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {

    private String A = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
    private String B = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
    private String C = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
    private String D = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";

    String pattern = A+"."+B+"."+C+"."+D;
}

