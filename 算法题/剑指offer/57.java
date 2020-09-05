//删除链表中重复的结点
public class Main {

    public static ListNode removeRepeat(ListNode p){
        ListNode head=new ListNode(-1,p);
        ListNode before=head;
        while (p!=null){
            ListNode q=p.next;
            if(q!=null&&p.val==q.val){
                while(q!=null&&p.val==q.val) {
                    q=q.next;
                }
                before.next=q;
                p=q;
            }
            else{
                before=p;
                p=p.next;

            }


        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode node =
                removeRepeat(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(3,new ListNode(4,new ListNode(4,new ListNode(4,new ListNode(5)))))))));
//                removeRepeat(new ListNode(1, new ListNode(2, new ListNode(3))));
        while (node!=null){
            System.out.print(node.val+" ");
            node=node.next;
        }
        System.out.println();
    }

}



