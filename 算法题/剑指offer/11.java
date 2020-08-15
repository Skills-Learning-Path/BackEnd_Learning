/*
数值的整数次方
*/

import java.util.*;


public class Main {

    public static double power(double base, int exp){
        if(exp==0){
            return 1;
        }
        else{
            double temp = positivePower(base, Math.abs(exp));
            return exp<0?1/temp:temp;
        }
    }

    public static double positivePower(double base, int exp){
        if(exp==0){
            return 1;
        }
        else if(exp==1){
            return base;
        }
        else{
            double temp = positivePower(base, exp>>1);//exp/2
            double res=temp*temp;
            if((exp&0x1)==1){//exp%2==1
                res=res*base;
            }
            return res;
        }
    }

    public static void main(String []args) throws Exception {
        System.out.println(power(5, 3));
    }

}

