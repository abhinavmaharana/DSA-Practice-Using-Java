package Basics.PepCoding.Loops.GcmLcm;

import java.util.Scanner;

public class GcmLcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int originalNum1 = num1;
        int originalNum2 = num2;

        while(num1 % num2 != 0){
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }

        int gcd = num2;
        int lcm = (originalNum1 * originalNum2)/gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
