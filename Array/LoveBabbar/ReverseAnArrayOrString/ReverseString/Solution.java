package Array.LoveBabbar.ReverseAnArrayOrString.ReverseString;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Solution {
    public static String reverseWord(String str)
    {
        // Reverse the string str
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
