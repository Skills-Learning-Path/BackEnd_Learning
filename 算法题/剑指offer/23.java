/*
二叉树层序遍历
*/
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;

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
    public static ArrayList<Integer> levelOrder(TreeNode p){
        ArrayList<Integer> list = new ArrayList<>();
        if(p==null) return list;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(p);
        while(queue.size()!=0){
            p=queue.remove();
            list.add(p.val);
            if(p.left!=null){
                queue.add(p.left);
            }
            if(p.right!=null){
                queue.add(p.right);
            }
        }
        return list;
    }

    public static void main(String args[])
    {
        System.out.println(levelOrder(new TreeNode(8, new TreeNode(6, new TreeNode(5), new TreeNode(7)), new TreeNode(10, new TreeNode(9), new TreeNode(11)))));
    }

}

