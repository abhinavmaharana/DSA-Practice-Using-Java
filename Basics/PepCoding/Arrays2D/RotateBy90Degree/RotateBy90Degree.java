package Basics.PepCoding.Arrays2D.RotateBy90Degree;

import java.util.Scanner;

public class RotateBy90Degree {
    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        // transpose
        for (int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i =0; i < arr.length; i++){
            int leftindex = 0;
            int rightindex = arr[i].length - 1;

            while (leftindex < rightindex) {
                int temp = arr[i][leftindex];
                arr[i][leftindex] = arr[i][rightindex];
                arr[i][rightindex] = temp;

                leftindex++;
                rightindex--;
            }
        }

        display(arr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
