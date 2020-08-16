/*
树的镜像
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
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class Main {

    public static void inOrder(TreeNode p){
        if(p!=null){
            inOrder(p.left);
            System.out.print(p.val+" ");
            inOrder(p.right);
        }
    }

    public static TreeNode mirror(TreeNode p){
        if(p==null) return null;
        else if(p.left==null&&p.right==null) return p;
        else{
            TreeNode temp = mirror(p.left);
            p.left = mirror(p.right);
            p.right = temp;
            return p;
        }
    }


    public static void main(String args[])
    {
        TreeNode t1 = new TreeNode(8, new TreeNode(8,new TreeNode(9),new TreeNode(2,new TreeNode(4),new TreeNode(7))),new TreeNode(7));
        TreeNode t2 = new TreeNode(8,new TreeNode(9),new TreeNode(2));
        inOrder(mirror(t2));
        System.out.println();
        inOrder(mirror(t1));
        System.out.println();
    }

}

