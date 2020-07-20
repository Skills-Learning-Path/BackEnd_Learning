/*
Question 2

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
* */

import java.util.Arrays;
import java.util.Stack;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {

        String str=val+" ";

        ListNode p=this;
        while(p.next!=null){
            p=p.next;
            str=str+p.val+" ";
        }
        return str;
    }
}
public class Main {
    public static void main(String []args)
    {
        ListNode l1=new ListNode(2,new ListNode(4, new ListNode(5)));
        ListNode l2=new ListNode(5,new ListNode(6, new ListNode(4)));
        System.out.println(addTwoNumbers(l1,l2));
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode l=new ListNode();
        ListNode p=l;
        ListNode p1=l1,p2=l2;
        while(p1!=null&&p2!=null){
            p.val=p1.val+p2.val;
            p1=p1.next;
            p2=p2.next;
            if(p1!=null&&p2!=null){
                p.next=new ListNode();
                p=p.next;
            }

        }
        if(p1!=null||p2!=null){
            p.next=new ListNode();
            p=p.next;
        }
        while(p1!=null){
            p.val=p1.val;
            p1=p1.next;
            if(p1!=null){
                p.next=new ListNode();
                p=p.next;
            }
        }
        while(p2!=null){
            p.val=p2.val;
            p2=p2.next;
            if(p2!=null){
                p.next=new ListNode();
                p=p.next;
            }
        }
        p=l;
        int flag=0;
        while(true){
            if(flag!=0) p.val+=1;
            if(p.val>=10) {
                p.val-=10;
                flag=1;
            }
            else
                flag=0;
            if(p.next!=null)
                p=p.next;
            else
                break;
        }
        if(flag!=0)
        {
            p.next=new ListNode(1);

        }

        return l;
    }

}
