/*
Question 4

There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5


* */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;




public class Main {

    public static void main(String []args) throws Exception {
        int[]a={1,3},b={2};
        System.out.println(findMedianSortedArrays(a,b));
        a=new int[]{1,2};
        b=new int[]{3,4};
        System.out.println(findMedianSortedArrays(a,b));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
//        int[] temp= new int[nums1.length+nums2.length];
//        System.arraycopy(nums1,0,temp,0,nums1.length);
//        System.arraycopy(nums2,0,temp,nums1.length,nums2.length);
//        Arrays.sort(temp);
//        if(temp.length%2==0)
//            return (temp[temp.length/2-1]+temp[temp.length/2])/2.0;
//        else
//            return temp[temp.length/2];
        int m=nums1.length;
        int n=nums2.length;
        int mid1=(m+n+1)/2;
        int mid2=(m+n+2)/2;
        return (findKth(nums1,0,nums2,0,mid1)+findKth(nums1,0,nums2,0,mid2))/2.0;
    }
    public static int findKth(int[] nums1, int offset1, int[] nums2, int offset2, int k){
        if(offset1>=nums1.length) return nums2[offset2+k-1];
        if(offset2>=nums2.length) return nums1[offset1+k-1];
        if(k==1) return Math.min(nums1[offset1],nums2[offset2]);
        int mid1=(offset1+k/2-1<nums1.length)?nums1[offset1+k/2-1]:Integer.MAX_VALUE;
        int mid2=(offset2+k/2-1<nums2.length)?nums2[offset2+k/2-1]:Integer.MIN_VALUE;
        if(mid1<mid2)
            return findKth(nums1,offset1+k/2,nums2,offset2,k-k/2);
        else
            return findKth(nums1,offset1,nums2,offset2+k/2,k-k/2);
    }
}
