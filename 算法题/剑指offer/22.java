/*
栈的压入、弹出序列
*/
import java.util.*;
import java.util.stream.Collectors;




public class Main {

    public static boolean isValidSeries(int[] in, int[] out){
        if(in==null||out==null||in.length==0||out.length==0||in.length!=out.length){
            return false;
        }
        else{
            Stack<Integer> stack = new Stack<>();
            int i=0;
            int j=0;
            do {
                if(i<in.length)
                    stack.push(in[i++]);
                if(stack.peek()==out[j]){
                    stack.pop();
                    j++;
                }
                else if(i>=in.length){
                    break;
                }
            }while (j<out.length);
            return stack.isEmpty();
        }
    }

    public static void main(String args[])
    {
        int[] a=new int[]{1,2,3,4,5};
        int[] b=new int[]{4,5,3,2,1};
        int[] c=new int[]{4,3,5,1,2};
        System.out.println(isValidSeries(a, b));
        System.out.println(isValidSeries(a, c));
    }

}

