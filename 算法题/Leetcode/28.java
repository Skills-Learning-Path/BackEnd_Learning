/*
Question 28

Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
* */

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String []args)
    {
        System.out.println(strStr("hello","ll"));
        System.out.println(strStr("aaaaa","bba"));
    }
    public static int strStr(String haystack, String needle){
        if(needle.equals("")) return 0;
        for (int i = 0; i <haystack.length() ; ) {
            int j=0;
            int temp=i;
            while(i<haystack.length()&&j<needle.length()&&haystack.charAt(i)==needle.charAt(j))
            {
                i++;
                j++;
            }
            if(j==needle.length()) return temp;
            else i=temp+1;
        }
        return -1;
    }

}
