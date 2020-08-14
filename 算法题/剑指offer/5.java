/*
反序打印链表
*/

import java.util.Stack;

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Main {

    public static void reversePrint(ListNode p){
        if(p==null) return;
        Stack<Integer> stack = new Stack<>();
        while(p!=null){
            stack.push(p.val);
            p=p.next;
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
            if(!stack.isEmpty())
                System.out.print("->");
        }
        System.out.println();
    }
    


    public static void main(String []args) throws Exception {
        reversePrint(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null))))));
        reversePrint(null);
    }

}

