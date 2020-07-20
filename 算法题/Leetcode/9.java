/*
Question 9

Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
* */

import java.util.Arrays;

public class Main {
    public static void main(String []args)
    {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x){
        int []a=new int[100];
        int num=x;
        if(x==0)
            return true;
        else if(x<0)
            return false;

        int i=0;
        while (x>0){
            a[i++]=x%10;
            x=x/10;
        }

        for (int j = 0; j < i; j++) {
            if(a[j]!=a[i-j-1])
                return false;
        }
        return true;
    }
}
