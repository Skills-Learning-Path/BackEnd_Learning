/*
链表倒数第k结点
*/

import java.util.*;

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val) {
        this.val = val;
        this.next=null;
    }
}


public class Main {

    public static ListNode lastKNode(ListNode p, int k){
        if(p==null||k<=0) return null;
        else{
            //two pointers
            ListNode q1=p;
            ListNode q2=p;
            int step=0;
            while(q1!=null){
                if(step==k-1) break;
                q1=q1.next;
                step++;
            }
            while(q1!=null&&q2!=null&&q1.next!=null){
                q1=q1.next;
                q2=q2.next;
            }
            if(q1!=null&&q1.next==null){
                return q2;
            }
            else{
                return null;
            }
        }
    }

    public static void main(String []args) throws Exception {
        System.out.println(lastKNode(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 3).val);
    }

}

