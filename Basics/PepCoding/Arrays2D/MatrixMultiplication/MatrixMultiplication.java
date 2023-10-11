package Basics.PepCoding.Arrays2D.MatrixMultiplication;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int row1 = scn.nextInt();
        int column1 = scn.nextInt();

        int[][] one = new int[row1][column1];
        for (int i = 0; i < one.length; i++){
            for (int j = 0; j < one[0].length; j++) {
                one[i][j] = scn.nextInt();
            }
        }

        int row2 = scn.nextInt();
        int column2 = scn.nextInt();

        int[][] two = new int[row2][column2];
        for (int i = 0; i < two.length; i++){
            for (int j = 0; j < two[0].length; j++) {
                two[i][j] = scn.nextInt();
            }
        }

        if (column1 != row2) {
            System.out.println("Invalid input");
            return;
        }

        int[][] product = new int[row1][column2];
        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[0].length; j++){
                for (int k = 0; k < column1; k++){
                    product[i][j] += one[i][k] * two[k][j];
                }
            }
        }

        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[0].length; j++){
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
