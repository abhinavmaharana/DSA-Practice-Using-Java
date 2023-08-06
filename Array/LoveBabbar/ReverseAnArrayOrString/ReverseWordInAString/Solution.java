package Array.LoveBabbar.ReverseAnArrayOrString.ReverseWordInAString;

public class Solution {
    public static String reverseWords(String S)
    {
        // Step wise breakdown to solve the problem
        // 1) Split the input string S into individual words using the dot ('.').
        // 2) Reverse the array of words.
        // 3) Join the reversed words back into a single string, separated by dots.

        String[] words = S.split("\\.");

        int left = 0;
        int right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            reversedString.append(word).append(".");
        }

        return reversedString.substring(0, reversedString.length() - 1);
    }
}
