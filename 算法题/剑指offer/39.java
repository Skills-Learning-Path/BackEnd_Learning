//二叉树的深度

public class Main {

    public static int treedepth(TreeNode p){
        if(p==null) return 0;
        else if(p.left==null&&p.right==null) return 1;
        else return 1+Math.max(treedepth(p.left),treedepth(p.right));
    }

    public static void main(String[] args) {
        System.out.println(treedepth(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
    }

}



