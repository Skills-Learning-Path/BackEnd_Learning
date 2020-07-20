/*
Question 70

You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

Example 1:

Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
* */

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String []args)
    {
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(10));
    }
    public static int climbStairs(int n){
        if(n==1) return 1;
        else if(n==2) return 2;
        int pre1=1;
        int pre2=2;
        int temp=pre1;
        for (int i = 3; i <= n; i++) {
            temp=pre1;
            pre1=pre2;
            pre2=temp+pre2;

        }
        return pre2;
    }

}
