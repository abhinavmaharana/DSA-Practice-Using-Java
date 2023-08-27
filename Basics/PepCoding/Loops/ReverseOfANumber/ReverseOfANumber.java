package Basics.PepCoding.Loops.ReverseOfANumber;

import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while (n!=0){
            int digit = n % 10;
            n = n / 10;
            System.out.println(digit);
        }
    }
}
