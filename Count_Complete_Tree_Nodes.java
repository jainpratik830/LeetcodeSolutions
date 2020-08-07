import java.util.LinkedList;
import java.util.Queue;

public class Count_Complete_Tree_Nodes {


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

    public static void main(String[] args) {

         TreeNode root=new TreeNode();
        if(root==null){
            System.out.println(0);
        }
        int count=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){

            TreeNode node=q.poll();
            count++;
            if(node.left!=null){
                q.offer(node.left);
            }
            if(node.right!=null){
                q.offer(node.right);
            }
        }

        System.out.println(count);
    }
}
