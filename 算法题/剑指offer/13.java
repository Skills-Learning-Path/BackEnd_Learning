/*
删除链表结点
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
        next=null;
    }
}

public class Main {

    public static ListNode delNode(ListNode head, ListNode p){
        if(head==null||p==null) return head;
        else if(head==p) return head.next;
        else{
            if(p.next==null){
                ListNode q=head;
                while(q!=null&&q.next!=p){
                    q=q.next;
                }
                if(q!=null){
                    q.next=null;
                }
            }
            else{
                p.val=p.next.val;
                p.next=p.next.next;
            }
            return head;
        }
    }



    public static void main(String []args) throws Exception {
        ListNode l=new ListNode(1,new ListNode(2,new ListNode(3)));
        ListNode p=l.next;
        ListNode node = delNode(l, p);
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }

}

