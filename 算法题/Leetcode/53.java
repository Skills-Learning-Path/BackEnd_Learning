/*
Question 53

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
* */

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String []args)
    {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums){
//        int sum=Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//
//            for(int window=0;window<nums.length-i;window++){
//                //[i,i+window]
//                int temp=0;
//                for (int j=i;j<=i+window;j++)
//                    temp+=nums[j];
//                if(temp>sum) sum=temp;
//            }
//        }
//        return sum;
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i = 1; i < len; i++){
            dp[i] = Math.max(nums[i],nums[i]+dp[i-1]);
                    // nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
//            dp[i]=Math.max(Math.max(dp[i-1],dp[i-1]+nums[i]),nums[i]);
        }
//        System.out.println(Arrays.toString(dp));
        return max;
    }

}
