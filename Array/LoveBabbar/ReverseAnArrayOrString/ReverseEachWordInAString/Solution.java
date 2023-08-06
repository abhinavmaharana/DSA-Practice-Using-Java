package Array.LoveBabbar.ReverseAnArrayOrString.ReverseEachWordInAString;

import java.util.Stack;

public class Solution {
    public static String reverseWords(String S)
    {
        Stack<Character> stck=new Stack<>();
        StringBuilder str=new StringBuilder();

        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='.'){
                while(!stck.isEmpty()){
                    str=str.append(stck.pop());
                }
                str.append('.');
            }
            else{
                stck.push(S.charAt(i));
            }
        }
        while(!stck.isEmpty()){
            str=str.append(stck.pop());
        }
        return str.toString();

    }
}
