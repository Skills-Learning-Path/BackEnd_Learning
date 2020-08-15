/*
根据前序、中序构造树
*/

import java.util.Stack;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int val) {
        this.val = val;
        left=null;
        right=null;
    }
}

public class Main {

    public static void preOrder(TreeNode t){
        if(t!=null){
            System.out.print(t.val+" ");
            preOrder(t.left);
            preOrder(t.right);
        }
    }

    public static void inOrder(TreeNode t){
        if(t!=null){
            inOrder(t.left);
            System.out.print(t.val+" ");
            inOrder(t.right);
        }
    }

    public static TreeNode constructTree(int[] pre, int[] in){
        if(pre.length==0||in.length==0){
            return null;
        }
        else{
            return constructTree(pre,0,pre.length-1,in,0,in.length-1);
        }
    }

    public static TreeNode constructTree(int[] pre, int pStart, int pEnd, int[] in, int iStart, int iEnd){
        if(pStart>pEnd||iStart>iEnd){
            return null;
        }
        TreeNode root = new TreeNode(pre[pStart]);
        for (int i=iStart; i<=iEnd; i++){
            if(in[i]==pre[pStart]){
		//pStart+ `distance from iStart to the root in `in` array`
                root.left = constructTree(pre,pStart+1, pStart+i-iStart, in, iStart, i-1);
                root.right = constructTree(pre,pStart+i-iStart+1, pEnd, in, i+1, iEnd);
                break;
            }
        }
        return root;
    }


    public static void main(String []args) throws Exception {
        TreeNode t = constructTree(new int[]{1,2,4,7,3,5,6,8},new int[]{4,7,2,1,5,3,8,6});
        preOrder(t);
        System.out.println();
        System.out.println("------------");
        inOrder(t);
        System.out.println();
    }

}

