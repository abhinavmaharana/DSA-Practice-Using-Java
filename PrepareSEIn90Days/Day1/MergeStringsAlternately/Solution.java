package PrepareSEIn90Days.Day1.MergeStringsAlternately;

import java.util.Scanner;

public class Solution {
    public static String main(String[] args) {
        StringBuilder sb = new StringBuilder();

        Scanner scn = new Scanner(System.in);

        int i = 0; // This will move around word1
        int j = 0; // This will move around word2

        boolean flag = true;

        CharSequence word1 = null;
        CharSequence word2 = null;
        while (i < word1.length() && j < word2.length()) {
            if (flag) {
                sb.append(word1.charAt(i));
                i++;
            } else {
                sb.append(word2.charAt(j));
                j++;
            }
            flag = !flag;
        }

        while(i < word1.length()){
            sb.append(word1.charAt(i));
            i++;
        }

        while(j < word2.length()){
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString();
    }
}
