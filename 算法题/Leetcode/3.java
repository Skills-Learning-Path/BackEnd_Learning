/*
Question 3

Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
* */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Main {
    public static void main(String []args)
    {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s){
        if(s==null||s.equals("")) return 0;
        int left=0,right=0,max=0;
        Set<Character> set=new HashSet<>();
        while(right<s.length()){
            char ch=s.charAt(right);
            if(set.contains(ch)){
                set.remove(s.charAt(left++));
            }
            else{
                set.add(s.charAt(right++));
                if(right-left>max){
                    max=right-left;
                }
            }
        }
        return max;
    }

}
