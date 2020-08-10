public class Path_Sum_3 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int paths=0;

    public void find(TreeNode node,int sum){

        if(node != null && node.val==sum){
            ++paths;
        }

        if(node!= null){
            sum -= node.val;
            find(node.left,sum);
            find(node.right,sum);
        }

    }

    public int pathSum(TreeNode root, int sum) {

        if(root==null){
            return paths;
        }

        find(root,sum);
        pathSum(root.left,sum);
        pathSum(root.right,sum);

        return paths;

    }
}
