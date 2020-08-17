/*
含有min的栈
*/
import java.util.*;
import java.util.stream.Collectors;

class MyStack{
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> temp = new Stack<>();
    Integer min = Integer.MAX_VALUE;
    public void push(Integer e){
        stack.push(e);
        if(e<min){
            temp.push(e);
            min=e;
        }
        else{
            temp.push(min);
        }
    }

    public Integer pop(){
        temp.pop();
        return stack.pop();
    }

    public Integer minValue(){
        int m=temp.pop();
        temp.push(m);
        return m;
    }
}


public class Main {



    public static void main(String args[])
    {
        MyStack stack = new MyStack();
        stack.push(4);
        stack.push(5);
        stack.push(2);
        stack.push(1);
        stack.push(3);
        System.out.println(stack.pop()+" "+stack.minValue());
        System.out.println(stack.pop()+" "+stack.minValue());
        System.out.println(stack.pop()+" "+stack.minValue());
        System.out.println(stack.pop()+" "+stack.minValue());
    }

}

