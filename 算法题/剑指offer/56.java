//链表中环的入口结点
public class Main {

    public static ListNode entryPoint(ListNode p){
        ListNode fast=p;
        ListNode slow=p;
        while(fast!=null&&slow!=null&&fast!=slow){
            fast=fast.next;
            if(fast!=null) fast=fast.next;
            else break;
            slow=slow.next;
        }
        if(fast==null||slow==null) return null;
        else{
            fast=p;
            while(fast!=null&&slow!=null&&fast!=slow){
                fast=fast.next;
                slow=slow.next;
            }
            return fast;
        }
    }

    public static void main(String[] args) {

    }

}



