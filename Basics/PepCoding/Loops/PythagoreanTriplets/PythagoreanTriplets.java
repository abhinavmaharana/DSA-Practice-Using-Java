package Basics.PepCoding.Loops.PythagoreanTriplets;

import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        // p^2 + b^2 = h^2
        // Lets us assume a is the hypotenuse
        int hypotenuse = a;
        if (b >= hypotenuse){
            hypotenuse = b;
        }
        if (c >- hypotenuse){
            hypotenuse = c;
        }

        if (hypotenuse == a){
            boolean flag = ((b * b + c * c) == (a * a));
            System.out.println(flag);
        } else if (hypotenuse == b){
            boolean flag = ((a * a + c * c) == (b * b));
            System.out.println(flag);
        } else {
            boolean flag = ((b * b + a * a) == (c * c));
            System.out.println(flag);
        }
    }
}
