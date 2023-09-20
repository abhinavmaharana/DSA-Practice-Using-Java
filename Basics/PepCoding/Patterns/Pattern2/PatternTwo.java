package Basics.PepCoding.Patterns.Pattern2;

import java.util.Scanner;

public class PatternTwo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=n; i>= 1; i--) {
            for (int j =1; j<=i; j++){
                System.out.print("*\t");
            }
            System.out.println(" ");
        }
    }
}
