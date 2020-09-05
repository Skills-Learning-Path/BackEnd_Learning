//把二叉树打印成多行
public class Main {

    public static ArrayList<ArrayList<Integer>> printReverse(TreeNode p){
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        queue.offer(p);
        while(!queue.isEmpty()){
            int n=queue.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                if(node==null) continue;
                else temp.add(node.val);

                queue.offer(node.left);
                queue.offer(node.right);
            }
            if(!temp.isEmpty()){
                res.add(temp);
            }


        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> lists = printReverse(new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(5, new TreeNode(6), new TreeNode(7))));
        for(ArrayList<Integer> ele:lists){
            System.out.println(ele);
        }

    }

}



