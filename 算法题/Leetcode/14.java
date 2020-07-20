/*
Question 14

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z.
* */

import java.util.Arrays;

public class Main {
    public static void main(String []args)
    {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
    public static String longestCommonPrefix(String[] strs){
        String minlengthStr="";
        int minlength=Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if(strs[i].length()<minlength)
            {
                minlength=strs[i].length();
                minlengthStr=strs[i];
            }
        }
        for (int i = minlengthStr.length(); i >=0 ; i--) {
            String candidatePrefix=minlengthStr.substring(0,i);
            boolean temp=true;
            for(String s:strs){
                if(!s.startsWith(candidatePrefix)){
                    temp=false;
                    break;
                }
            }
            if(temp)
                return candidatePrefix;

        }
        return "";
    }

}
