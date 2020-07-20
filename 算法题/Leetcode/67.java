/*
Question 67

Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"


Constraints:

Each string consists only of '0' or '1' characters.
1 <= a.length, b.length <= 10^4
Each string is either "0" or doesn't contain any leading zero.
* */

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String []args)
    {
        System.out.println(addBinary("11","1"));
        System.out.println(addBinary("1010","1011"));
    }
    public static String addBinary(String a, String b){
        if(a==null) return b;
        if(b==null) return a;
        int len=Math.max(a.length(),b.length());
        while(a.length()!=len)
            a="0"+a;
        while(b.length()!=len)
            b="0"+b;
        String c="";
        int flag=0;
        for(int i=len-1;i>=0;i--){
            int temp=flag+(a.charAt(i)-'0')+(b.charAt(i)-'0');
            switch (temp){
                case 0:
                    c="0"+c;
                    flag=0;
                    break;
                case 1:
                    c="1"+c;
                    flag=0;
                    break;
                case 2:
                    c="0"+c;
                    flag=1;
                    break;
                case 3:
                    c="1"+c;
                    flag=1;
                    break;
                default:
                    return null;
            }
        }
        if(flag==1)
            c="1"+c;
        return c;
    }

}
