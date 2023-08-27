package Basics.PepCoding.Loops.InverseOfNumber;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int inverse = 0;
        int originalPlace = 1;
        while(n!=0){
            int originalDigit = n % 10;
            int invertedDigit = originalPlace;
            int invertedPlace = originalDigit;

            inverse = inverse + invertedDigit * (int)Math.pow(10, invertedPlace -1);

            n = n / 10;
            originalPlace++;
        }

        System.out.println(inverse);
    }
}
