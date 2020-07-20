/*
Question 7

Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
* */

import java.util.Arrays;

public class Main {
    public static void main(String []args)
    {
        System.out.println(reverse(-1234));
        System.out.println(reverse(2147483647));
    }
    public static int reverse(int x){
        int []a=new int[100];
        int flag=0;
        if(x==0)
            return 0;
        else if(x>0)
            flag=0;
        else
            flag=1;
        x=Math.abs(x);
        int i=0;
        while (x>0){
            a[i++]=x%10;
            x=x/10;
        }
//        System.out.println(Arrays.toString(a));
        if(i>10) return 0;
        else if(i==10)
        {
            if(flag==0&&(a[0]>2||(a[0]==2&&a[1]>1)||(a[0]==2&&a[1]==1&&a[2]>4)||(a[0]==2&&a[1]==1&&a[2]==4&&a[3]>7)||(a[0]==2&&a[1]==1&&a[2]==4&&a[3]==7&&a[4]>4)||(a[0]==2&&a[1]==1&&a[2]==4&&a[3]==7&&a[4]==4&&a[5]>8)||(a[0]==2&&a[1]==1&&a[2]==4&&a[3]==7&&a[4]==4&&a[5]==8&&a[6]>3)||(a[0]==2&&a[1]==1&&a[2]==4&&a[3]==7&&a[4]==4&&a[5]==8&&a[6]==3&&a[7]>6)||(a[0]==2&&a[1]==1&&a[2]==4&&a[3]==7&&a[4]==4&&a[5]==8&&a[6]==3&&a[7]==6&&a[8]>4)||(a[0]==2&&a[1]==1&&a[2]==4&&a[3]==7&&a[4]==4&&a[5]==8&&a[6]==3&&a[7]==6&&a[8]==4&&a[9]>7)))
                return 0;
            else if(flag==1&&(a[0]>2||(a[0]==2&&a[1]>1)||(a[0]==2&&a[1]==1&&a[2]>4)||(a[0]==2&&a[1]==1&&a[2]==4&&a[3]>7)||(a[0]==2&&a[1]==1&&a[2]==4&&a[3]==7&&a[4]>4)||(a[0]==2&&a[1]==1&&a[2]==4&&a[3]==7&&a[4]==4&&a[5]>8)||(a[0]==2&&a[1]==1&&a[2]==4&&a[3]==7&&a[4]==4&&a[5]==8&&a[6]>3)||(a[0]==2&&a[1]==1&&a[2]==4&&a[3]==7&&a[4]==4&&a[5]==8&&a[6]==3&&a[7]>6)||(a[0]==2&&a[1]==1&&a[2]==4&&a[3]==7&&a[4]==4&&a[5]==8&&a[6]==3&&a[7]==6&&a[8]>4)||(a[0]==2&&a[1]==1&&a[2]==4&&a[3]==7&&a[4]==4&&a[5]==8&&a[6]==3&&a[7]==6&&a[8]==4&&a[9]>8)))
                return 0;
        }
        int y=0;
        for (int j = 0; j < i; j++) {
            y+=(a[j]*Math.pow(10,i-j-1));
        }
        if(flag==1)
            y=-y;
        return y;
    }
}
