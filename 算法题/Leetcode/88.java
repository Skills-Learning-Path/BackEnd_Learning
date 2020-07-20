/*
Question 88

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
* */

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String []args)
    {
        int[] nums1=new int[]{1,2,3,0,0,0};
        int[] nums2={2,5,6};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
//        System.out.println(Arrays.toString(merge(new int[]{1,2,3},3,new int[]{2,5,6},3)));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int[] res=new int[m+n];
        int p1=0,p2=0;
        int i=0;
        while(p1<m&&p2<n){
            if(nums1[p1]<nums2[p2]){
                res[i++]=nums1[p1++];
            }
            else{
                res[i++]=nums2[p2++];
            }
//            System.out.println(p1+" "+p2);
//            System.out.println(Arrays.toString(res));
        }
        while(p1<m){
            res[i++]=nums1[p1++];
        }
        while(p2<n){
            res[i++]=nums2[p2++];
        }

        for (i = 0; i < res.length; i++) {
            nums1[i]=res[i];
        }


    }

}
