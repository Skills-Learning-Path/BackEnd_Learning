/*
两个栈实现队列
两个队列实现栈
*/

import java.util.*;

class MyQueue{
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    public void inQueue(Integer ele){
        stack1.push(ele);
    }
    public Integer deQueue(){
        if(stack1.isEmpty()&&stack2.isEmpty()){
            throw new NoSuchElementException();
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                Integer temp = stack1.pop();
                stack2.push(temp);
            }
        }
        return stack2.pop();
    }
    public boolean isEmpty(){
        return stack1.isEmpty()&&stack2.isEmpty();
    }

}
class MyStack{
    private Queue<Integer> queue1 = new ArrayDeque<>();
    private Queue<Integer> queue2 = new ArrayDeque<>();
    public void push(Integer ele){
        if(!queue1.isEmpty()){
            queue1.offer(ele);
        }
        else {
            queue2.offer(ele);
        }
    }
    public Integer pop(){
        if(!queue1.isEmpty()&&queue2.isEmpty()){
            while(queue1.size()>1){
                Integer temp = queue1.poll();
                queue2.offer(temp);
            }
            return queue1.poll();
        }
        else if(queue1.isEmpty()&&!queue2.isEmpty()){
            while(queue2.size()>1){
                Integer temp = queue2.poll();
                queue1.offer(temp);
            }
            return queue2.poll();
        }
        else{
            throw new EmptyStackException();
        }
    }
    public boolean isEmpty(){
        return queue1.isEmpty()&&queue2.isEmpty();
    }
}

public class Main {



    public static void main(String []args) throws Exception {
        MyQueue queue = new MyQueue();
        queue.inQueue(1);
        queue.inQueue(2);
        queue.inQueue(3);
        queue.inQueue(4);
        queue.inQueue(5);
        while(!queue.isEmpty()){
            System.out.println(queue.deQueue());
        }
//        System.out.println(queue.deQueue());
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
//        System.out.println(stack.pop());
    }

}

