/*
数值的整数次方
*/

import java.util.*;


public class Main {

    public static double power(double x, int n){
        if (n == 0)
            return 1;
    	//如果n小于0，把它改为正数，并且把1/x提取出来一个
        if (n < 0)
            return 1 / x * myPow(1 / x, -n - 1);
        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }

    

    public static void main(String []args) throws Exception {
        System.out.println(power(5, 3));
    }

}

