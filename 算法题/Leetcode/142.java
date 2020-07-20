/*
Question 142

Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

Note: Do not modify the linked list.



Example 1:

Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.


Example 2:

Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.


Example 3:

Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the linked list.


* */

import java.util.HashSet;
import java.util.Set;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
      ListNode(int x,ListNode p) {
        val = x;
        next = p;
    }

    @Override
    public String toString() {

        return val+"";
    }
}


public class Main {

    public static void main(String []args) throws Exception {
        ListNode p3=new ListNode(-4);
        ListNode p2=new ListNode(0,p3);
        ListNode p1=new ListNode(2,p2);
        ListNode p0=new ListNode(3,p1);
        p3.next=p1;
        System.out.println(detectCycle(p0));
    }
    public static ListNode detectCycle(ListNode head) {
        Set<ListNode> set=new HashSet<>();
        ListNode p=head;
        while(p!=null) {
            if (!set.contains(p))
                set.add(p);
            else
                return p;

            p = p.next;

        }
        return null;
//        ListNode pfast=head;
//        ListNode pslow=head;
//        while (pslow!=null&&pfast!=null&&pfast.next!=null){
//            pslow=pslow.next;
//            pfast=pfast.next.next;
//            if(pslow!=null&&pfast!=null&&pslow==pfast) return true;
//        }
//        return false;
    }
}
