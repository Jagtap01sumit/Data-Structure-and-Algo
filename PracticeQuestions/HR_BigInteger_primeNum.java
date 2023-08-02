package PracticeQuestions;

import java.math.BigInteger;
import java.util.Scanner;

public class HR_BigInteger_primeNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        BigInteger n = new BigInteger(scanner.nextLine());
        System.out.println(isPrime(n) ? "prime" : "not prime");
    }

    private static boolean isPrime(BigInteger n) {
        return n.isProbablePrime(1);
    }


}
