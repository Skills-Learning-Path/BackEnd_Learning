/*
Question 83

Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2
Example 2:

Input: 1->1->2->3->3
Output: 1->2->3
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
        String s="";
        ListNode temp=this;
        while(temp!=null){
            s=s+temp.val+" ";
            temp=temp.next;
        }
        return s;
    }
}
public class Main {
    public static void main(String []args)
    {
        ListNode l1=new ListNode(1,new ListNode(1,new ListNode(2)));
        ListNode l2=new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(3)))));
        System.out.println(deleteDuplicates(l1));
        System.out.println(deleteDuplicates(l2));
    }
    public static ListNode deleteDuplicates(ListNode head){
        if(head==null) return null;
        ListNode temp=head.next;
        while(temp!=null&&head.val==temp.val)
        {
            temp=temp.next;
        }
        head.next=deleteDuplicates(temp);
        return head;
    }

}
