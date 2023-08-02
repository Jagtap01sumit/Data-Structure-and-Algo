package PracticeQuestions;

import java.text.*;
import java.util.Locale;
import java.util.Scanner;

public class HR_currency_formatter {


    // Write your code here.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value");
        double payment = scanner.nextDouble();
        scanner.close();
        Locale India = new Locale("en", "IN");


        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String india = NumberFormat.getCurrencyInstance(India).format(payment);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);


    }
}