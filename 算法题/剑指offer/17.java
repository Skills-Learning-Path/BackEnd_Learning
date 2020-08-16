/*
合并有序链表
*/

import java.util.*;
import java.util.stream.Collectors;

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

    public static ListNode merge(ListNode p1, ListNode p2){
        if(p1==null) return p2;
        else if(p2==null) return p1;
        else{
            ListNode head = null;
            if(p1.val<p2.val){
                head = new ListNode(p1.val);
                p1=p1.next;
            }
            else{
                head = new ListNode(p2.val);
                p2=p2.next;
            }
            ListNode q = head;
            while(p1!=null&&p2!=null){
                if(p1.val<p2.val){
                    ListNode temp = new ListNode(p1.val);
                    p1=p1.next;
                    q.next=temp;
                    q=q.next;
                }
                else{
                    ListNode temp = new ListNode(p2.val);
                    p2=p2.next;
                    q.next=temp;
                    q=q.next;
                }
            }
            while(p1!=null){
                ListNode temp = new ListNode(p1.val);
                p1=p1.next;
                q.next=temp;
                q=q.next;
            }
            while (p2!=null){
                ListNode temp = new ListNode(p2.val);
                p2=p2.next;
                q.next=temp;
                q=q.next;
            }
            return head;
        }
    }


    public static void main(String args[])
    {
        ListNode p1 = new ListNode(1,new ListNode(3,new ListNode(5,new ListNode(7))));
        ListNode p2 = new ListNode(2,new ListNode(4,new ListNode(6)));
        ListNode p3 = merge(p1,p2);
        while(p3!=null){
            System.out.print(p3.val+" ");
            p3=p3.next;
        }
    }

}

