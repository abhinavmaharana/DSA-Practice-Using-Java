package Basics.Hackerrank.JavaBasics.Introduction.JavaCurrencyFormatter;
import java.util.*;
import java.text.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.

        // USD
        NumberFormat numformat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = numformat.format(payment);

        // INR
        NumberFormat numformat1 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = numformat1.format(payment);

        // Yuan
        NumberFormat numformat2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = numformat2.format(payment);

        // Euro
        NumberFormat numformat3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = numformat3.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
