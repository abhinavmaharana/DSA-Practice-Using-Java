package Basics.PepCoding.Arrays2D.SpiralTraversal;

import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int [][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int minrow = 0;
        int mincolumn = 0;

        int maxrow = arr.length - 1;
        int maxcolumn = arr[0].length - 1;
        int totalNumberOfElements = n * m;
        int counter = 0;

        while (counter < totalNumberOfElements){
            // left wall
            for (int i = minrow, j = mincolumn; i <= maxrow && counter < totalNumberOfElements; i++){
                System.out.println(arr[i][j]);
                counter++;
            }
            mincolumn++;
            // bottom wall
            for (int i = maxrow, j = mincolumn; j <= maxcolumn && counter < totalNumberOfElements; j++){
                System.out.println(arr[i][j]);
                counter++;
            }
            maxrow--;

            // right wall
            for (int i = maxrow, j = mincolumn; i >= minrow && counter < totalNumberOfElements; i--){
                System.out.println(arr[i][j]);
                counter++;
            }
            maxcolumn--;

            // top wall
            for (int i = minrow, j = maxcolumn; j >= mincolumn && counter < totalNumberOfElements; j--){
                System.out.println(arr[i][j]);
                counter++;
            }
            minrow++;
        }

    }
}
