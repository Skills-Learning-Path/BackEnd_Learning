/*
树的子结构
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

    public static boolean isSubConstruct(TreeNode a, TreeNode b){
        if(a==null||b==null) return false;
        else return isSubTree(a,b)||isSubConstruct(a.left,b)||isSubConstruct(a.right,b);
    }

    public static boolean isSubTree(TreeNode a, TreeNode b){
        if(b==null) return true;
        else if(a==null) return false;
        else if(a.val!=b.val) return false;
        else return isSubTree(a.left,b.left)&&isSubTree(a.right,b.right);
    }


    public static void main(String args[])
    {
        TreeNode t1 = new TreeNode(8, new TreeNode(8,new TreeNode(9),new TreeNode(2,new TreeNode(4),new TreeNode(7))),new TreeNode(7));
        TreeNode t2 = new TreeNode(8,new TreeNode(9),new TreeNode(2));
        System.out.println(isSubConstruct(t1, t2));
    }

}

