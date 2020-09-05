//对称的二叉树
public class Main {

    public static boolean satisfy(TreeNode p){
        if(p==null) return true;
        else return isSame(p.left,p.right);
    }

    public static boolean isSame(TreeNode left, TreeNode right){
        if(left==null&&right==null) return true;
        else if(left!=null&&right!=null)
            return left.val==right.val&&isSame(left.left,right.right)&&isSame(left.right,right.left);
    }

    public static void main(String[] args) {

    }

}



