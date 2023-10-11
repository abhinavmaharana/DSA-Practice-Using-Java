package Basics.PepCoding.Arrays2D.SaddlePoint;

import java.util.Scanner;

public class SaddlePoint {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int smallestvaluej = 0;
            for(int j = 1; j < arr[0].length; j++){
                if (arr[i][j] < arr[i][smallestvaluej]) {
                    smallestvaluej = j;
                }
            }

            boolean flag = true;
            for(int k = 0; k < arr.length; k++) {
                if (arr[k][smallestvaluej] > arr[i][smallestvaluej]){
                    flag = false;
                    break;
                }
            }

            if(flag == true){
                System.out.println(arr[i][smallestvaluej]);
                return;
            }
        }

        System.out.println("Invalid input");
    }
}
