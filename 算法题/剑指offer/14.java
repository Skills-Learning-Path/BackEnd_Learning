/*
调整数组顺序使奇数位于偶数前面
*/

import java.util.*;



public class Main {

    public static void reArrage(int[] a){
        if(a==null||a.length==0) return;
        else{
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length-1; j++) {
                    if(a[j]%2==0&&a[j+1]%2==1){
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }
        }
    }



    public static void main(String []args) throws Exception {
        int[] a=new int[]{1,2,3,4,5,6,7,8,9};
        reArrage(a);
        System.out.println(Arrays.toString(a));
    }

}

