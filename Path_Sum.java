public class Path_Sum {

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


    public boolean dfs(TreeNode node,int sum,int curr){


        if(node.left==null && node.right==null){
            if(sum==curr+node.val)
                return true;
            return false;
        }

        if(node.left!= null && node.right!=null )
            return (dfs(node.left,sum,curr+node.val)||dfs(node.right,sum,curr+node.val));

        if(node.left== null && node.right!=null )
            return (dfs(node.right,sum,curr+node.val));

        if(node.left!= null && node.right==null )
            return (dfs(node.left,sum,curr+node.val));

        return false;

    }


    public boolean hasPathSum(TreeNode root, int sum) {

        if(root==null){
            return false;
        }

        return dfs(root,sum,0);
    }


}
