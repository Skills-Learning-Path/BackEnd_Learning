/*
Question 21

Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
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
        ListNode l1=new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode l2=new ListNode(1,new ListNode(3,new ListNode(4)));
        System.out.println(mergeTwoLists(l1,l2));
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode l=new ListNode(0,null);
        ListNode node=l;
        ListNode p1=l1;
        ListNode p2=l2;
        while(p1!=null&&p2!=null){
            if(p1.val<=p2.val) {
                node.next=p1;
                p1=p1.next;

            }
            else{
                node.next=p2;
                p2=p2.next;

            }
            node=node.next;
        }
        if(p1!=null){
            node.next=p1;
        }
        if(p2!=null){
            node.next=p2;
        }
        return l.next;
    }

}
