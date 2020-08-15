/*
判断二进制数中1的个数
*/

import java.util.*;


public class Main {

    public static int num1(long n){
        int sum=0;
        while(n!=0){
            sum++;
            n=(n-1)&n;
        }
        return sum;
    }

    public static void main(String []args) throws Exception {
        System.out.println(num1(9));
    }

}

