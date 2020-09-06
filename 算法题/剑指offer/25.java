


/*
二叉树中和为某一值的路径
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
    public static ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
    public static ArrayList<Integer> temp = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> findPaths(TreeNode p, int target){
        if(p==null) return lists;
        target-=p.val;
        temp.add(p.val);
        if(target==0 && p.left==null && p.right==null){

            lists.add(new ArrayList<>(temp));
        }
        else{
            findPaths(p.left,target);
            findPaths(p.right,target);
        }
        temp.remove(temp.size()-1);
        return lists;
    }


    public static void main(String args[])
    {
        TreeNode node = new TreeNode(10, new TreeNode(5, new TreeNode(4), new TreeNode(7)), new TreeNode(12));
        System.out.println(findPaths(node, 22));
    }

}

