/*
Question 69

Implement int sqrt(int x).

Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

Example 1:

Input: 4
Output: 2
Example 2:

Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since
             the decimal part is truncated, 2 is returned.
* */

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String []args)
    {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(2147395599));
    }
    public static int mySqrt(int x){
        int a=0,b=x;
        //[a,b]
        long mid=0;
        while(a<=b){
            mid=(a+b)/2;
            if(mid*mid==x) return (int)mid;
            else if(mid*mid>x) b=(int)mid-1;
            else if((mid+1)*(mid+1)>x) return (int)mid;
            else a=(int)mid+1;
        }
        return (int)mid;
    }

}
