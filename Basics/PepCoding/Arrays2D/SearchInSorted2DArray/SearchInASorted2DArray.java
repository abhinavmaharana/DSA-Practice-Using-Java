package Basics.PepCoding.Arrays2D.SearchInSorted2DArray;

import java.util.Scanner;

public class SearchInASorted2DArray {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int x = scn.nextInt();

        int i = 0;
        int j = arr[0].length - 1;

        while (i < arr.length && j >= 0) {
            if (x == arr[i][j]){
                System.out.println(i);
                System.out.println(j);
            } else if (x < arr[i][j]) {
                j--;
            } else {
                i++;
            }
        }

        System.out.println("Not Found");
    }
}
