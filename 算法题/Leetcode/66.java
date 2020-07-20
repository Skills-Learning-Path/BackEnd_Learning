/*
Question 66

Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
* */

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String []args)
    {
        System.out.println(Arrays.toString(plusOne(new int[]{1,2,3})));
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9})));
    }
    public static int[] plusOne(int[] digits){
        int len=digits.length;
        digits[len-1]++;
        if(digits[len-1]<=9) return digits;
        else{
            for (int i = digits.length - 1; i > 0; i--) {
                if(digits[i]>=10){
                    digits[i]-=10;
                    digits[i-1]+=1;
                }
            }
            if(digits[0]<=9) return digits;
            else{
                int[] res=new int[len+1];
                for (int i = 1; i < len+1; i++) {
                    res[i]=digits[i-1];
                }
                res[1]-=10;
                res[0]=1;
                return res;
            }
        }
    }

}
