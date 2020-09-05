//二叉搜索树的第k个结点
public class Main {
    public static int count=0;
    public static TreeNode kthNode(TreeNode p, int k){
        if(p!=null){
            TreeNode node = kthNode(p.left, k);
            if(node!=null) return node;
            count++;
            if(count==k) return p;
            else return kthNode(p.right,k);
        }
        else return null;
    }

    public static void main(String[] args) {


    }

}



