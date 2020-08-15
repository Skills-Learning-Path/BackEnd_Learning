/*
打印1到最大的n位数
*/

import java.util.*;


public class Main {

    public static List<Long> print(int n){
        ArrayList<Long> list = new ArrayList<>();
        if(n>0){
            list.addAll(print(n-1));
            long minValue = list.isEmpty()?(-1):list.get(list.size() - 1);
            minValue++;
            long maxValue = (minValue==0)?9:minValue*10-1;
            for (long i = minValue; i <= maxValue; i++) {
                list.add(i);
            }
        }
        return list;
    }



    public static void main(String []args) throws Exception {
        System.out.println(print(3));
    }

}
