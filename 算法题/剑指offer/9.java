/*
斐波那契数列
*/

import java.util.*;


public class Main {

    public static long fibnoacci(int n){
        if(n<=0) return 0;
        long a=0;
        long b=1;
        for (int i = 2; i <= n; i++) {
            long c=a+b;
            a=b;
            b=c;
        }
        return b;
    }

    public static void main(String []args) throws Exception {
        System.out.println(fibnoacci(5));
    }

}

