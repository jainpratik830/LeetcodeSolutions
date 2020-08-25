public class Sum_of_Left_Leaves {
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
    public int dfs(TreeNode root,boolean l){

        if(root==null){
            return 0;
        }
        int s=0;
        if(l && root.left==null && root.right==null){
            s+= root.val;
        }
        int r=dfs(root.left,true) +dfs(root.right,false);

        return r+s;

    }

    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root,false);
    }


}
