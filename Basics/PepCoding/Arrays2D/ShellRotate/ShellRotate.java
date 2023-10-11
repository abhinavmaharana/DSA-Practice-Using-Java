package Basics.PepCoding.Arrays2D.ShellRotate;

import java.util.Scanner;

public class ShellRotate {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int [][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int shell = scn.nextInt();
        int numberOfRotate = scn.nextInt();

        rotateShell(arr, shell, numberOfRotate);
        display(arr);
    }

    public static void rotateShell(int[][] arr, int shell, int numberOfRotate) {
        int[] oned = fillOnedFromShell(arr, shell);
        rotate(oned, numberOfRotate);
        fillShellFromOned(arr, shell, oned);
    }

    public static  int[] fillOnedFromShell(int[][] arr, int shell) {
        int minr = shell - 1;
        int minc = shell - 1;
        int maxr = arr.length - shell;
        int maxc = arr[0].length - shell;
        int size = 2 * (maxr - minr) + 2 * (maxc - minc);
        int[] oned = new int[size];

        int index = 0;

        // left wall
        for (int i = minr, j = minc; i <= maxr; i++) {
            oned[index] = arr[i][j];
            index++;
        }

        //bottom wall
        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
            oned[index] = arr[i][j];
            index++;
        }

        // Right wall
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            oned[index] = arr[i][j];
            index++;
        }

        // Top wall
        for (int i = minr, j = maxc - 1; j > minc; j--) {
            oned[index] = arr[i][j];
            index++;
        }

        return oned;
    }

    public static int[] fillShellFromOned(int[][] arr, int shell, int[] oned) {
        int minr = shell - 1;
        int minc = shell - 1;
        int maxr = arr.length - shell;
        int maxc = arr[0].length - shell;

        int index = 0;

        // left wall
        for (int i = minr, j = minc; i <= maxr; i++) {
            arr[i][j] = oned[index];
            index++;
        }

        //bottom wall
        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
            arr[i][j] = oned[index];
            index++;
        }

        // Right wall
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            arr[i][j] = oned[index];
            index++;
        }

        // Top wall
        for (int i = minr, j = maxc - 1; j > minc; j--) {
            arr[i][j] = oned[index];
            index++;
        }

        return oned;
    }

    public static void rotate(int[] oned, int numberOfRotate) {
         numberOfRotate = numberOfRotate % oned.length;
         if (numberOfRotate < 0) {
             numberOfRotate = numberOfRotate + oned.length;
         }

         reverse(oned, 0,oned.length-numberOfRotate-1);
         reverse(oned, oned.length - numberOfRotate, oned.length - 1);
         reverse(oned, 0, oned.length - 1);
    }

    public static void reverse(int[] oned, int li, int ri) {
        while (li < ri) {
            int temp = oned[li];
            oned[li] = oned[ri];
            oned[ri] = temp;
            li++;
            ri--;
        }
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
