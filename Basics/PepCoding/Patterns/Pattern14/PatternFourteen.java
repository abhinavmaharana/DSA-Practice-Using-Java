package Basics.PepCoding.Patterns.Pattern14;

import java.util.Scanner;

public class PatternFourteen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        for (int i = 1; i <= 10; i++) {
            int v = x * i;
            System.out.println(x + " * " + i + " = " + v);
        }
    }
}
