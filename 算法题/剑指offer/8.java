/*
旋转数组最小值
*/

import java.util.*;


public class Main {

    public static int minNumRotateArray(int[] a){
        if(a.length==0) throw new NullPointerException();
        int low=0;
        int high=a.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(a[mid]<a[high]){
                high=mid;
            }
            else if(a[mid]==a[high]){
                high=high-1;
            }
            else{
                low=mid+1;
            }
        }
        return a[low];
    }

    public static void main(String []args) throws Exception {
        System.out.println(minNumRotateArray(new int[]{3, 4, 5, 1, 2}));
    }

}

