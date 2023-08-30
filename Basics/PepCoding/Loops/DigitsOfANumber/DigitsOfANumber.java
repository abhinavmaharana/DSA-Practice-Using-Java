package Basics.PepCoding.Loops.DigitsOfANumber;

import java.util.Scanner;

public class DigitsOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nod = 0; // nod = number of digit
        int temp = n;
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }

        int div = 1;
        for (int i = 1; i < nod; i++) {
            div *= 10;
        }

        while (div != 0) {
            int quotient = n / div;
            System.out.println(quotient);
            n = n % div;
            div = div / 10;
        }
    }
}
