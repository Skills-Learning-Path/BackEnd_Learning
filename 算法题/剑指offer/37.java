//两个链表的第一个公共结点
public class Main {

    public static ListNode commonNode(ListNode p1, ListNode p2){
        Stack<ListNode> s1 = new Stack<>();
        while(p1!=null){
            s1.push(p1);
            p1=p1.next;
        }
        Stack<ListNode> s2 = new Stack<>();
        while(p2!=null){
            s2.push(p2);
            p2=p2.next;
        }
        ListNode res = null;
        while (!s1.isEmpty()&&!s2.isEmpty()){
            ListNode temp1 = s1.pop();
            ListNode temp2 = s2.pop();
            if(temp1!=temp2) {
                break;
            }
            else{
                res=temp1;
            }
        }
        return res;
    }

    public static void main(String args[]) {

    }

}



