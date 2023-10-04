package Basics.PepCoding.StringsStringBuilderArrayList.PrintAllPermutationsOfAStringIteratively;

import java.util.Scanner;

public class PrintAllPermutations {
    public static void solution(String str) {
        int n = str.length();
        int f = factorial(n);

        for (int i = 0; i < f; i++) {
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for (int div = n; div >= 1; div--) {
                int quotient = temp / div;
                int remainder = temp % div;

                System.out.print(sb.charAt(remainder));
                sb.deleteCharAt(remainder);

                temp=quotient;
            }

            System.out.println();
        }

    }

    public static int factorial(int n) {
        int value = 1;
        for (int i = 2; i <= n; i++){
            value *= i;
        }

        return value;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }
}
