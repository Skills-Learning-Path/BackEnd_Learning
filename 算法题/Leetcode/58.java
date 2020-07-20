/*
Question 58

Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.

If the last word does not exist, return 0.

Note: A word is defined as a maximal substring consisting of non-space characters only.

Example:

Input: "Hello World"
Output: 5
* */

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String []args)
    {
        System.out.println(lengthOfLastWord("Hello World"));
    }
    public static int lengthOfLastWord(String s){
        if(s==null) return 0;
        String sArr[]=s.split(" ");
        for (int i = sArr.length-1; i >=0 ; i--) {
            if(sArr[i].length()!=0) return sArr[i].length();
        }
        return 0;
    }

}
