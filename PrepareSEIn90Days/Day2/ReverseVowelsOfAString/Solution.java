package PrepareSEIn90Days.Day2.ReverseVowelsOfAString;

public class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while(leftIndex < rightIndex) {
            char charAtLeft = arr[leftIndex];
            char charAtRight = arr[rightIndex];

            if(isVowel(charAtLeft) && isVowel(charAtRight)) {
                arr[leftIndex] = charAtRight;
                arr[rightIndex] = charAtLeft;
                leftIndex++;
                rightIndex--;
            } else if (isVowel(charAtLeft)){
                rightIndex--;
            } else if (isVowel(charAtRight)){
                leftIndex++;
            } else {
                leftIndex++;
                rightIndex--;
            }
        }

        return new String(arr);
    }

    boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'A'){
            return true;
        } else if(ch == 'e' || ch == 'E'){
            return true;
        } else if(ch == 'i' || ch == 'I'){
            return true;
        } else if(ch == 'o' || ch == 'O'){
            return true;
        } else if(ch == 'u' || ch == 'U'){
            return true;
        } else {
            return false;
        }
    }
}
