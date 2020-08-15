/*
反转链表
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

    public static ListNode reverseList(ListNode head){
        if(head==null||head.next==null) return head;
        else{
            ListNode pre=null;
            ListNode next=null;
            while (head!=null){
                //reverse pointers
                next=head.next;
                head.next=pre;
                //next iteration
                pre=head;
                head=next;
            }
            return pre;
        }
    }

    public static void main(String []args) throws Exception {
        ListNode l= new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode node = reverseList(l);
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }

}

