//二叉树的下一个结点
public class Main {

    public static TreeNode nextNode(TreeNode p){
        if(p==null) return null;
        else if(p.right!=null){
            TreeNode q=p.right;
            while (q.left!=null){
                q=q.left;
            }
            return q;
        }
        else{
            while(p.next != null){
                TreeNode root = p.next;
                if(p == root.left)
                    return root;
                p = root;
            }
            return null;
        }
    }

    public static void main(String[] args) {

    }

}



