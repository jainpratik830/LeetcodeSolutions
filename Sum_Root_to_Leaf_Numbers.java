import java.util.LinkedList;
import java.util.Queue;

public class Sum_Root_to_Leaf_Numbers {

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

    public static class Point{
        TreeNode node;
        int number;
        Point(TreeNode node,int number){
            this.node=node;
            this.number=number;
        }
    }


    public static void main(String[] args) {

        TreeNode root=new TreeNode();
        if(root==null){
            System.out.println(0);
        }
        Queue<Point>  queue=new LinkedList<>();
        queue.offer(new Point(root,root.val));

        int count =0;
        while (!queue.isEmpty()){

            Point p=queue.poll();
            TreeNode node=p.node;
            int x=p.number;
            if (node.left==null && node.right==null){
                count+= x;
            }
            if (node.left!=null) {
                queue.offer(new Point(node.left, x * 10 + node.left.val));
            }
            if (node.right!=null) {
                queue.offer(new Point(node.right, x * 10 + node.right.val));
            }

        }


        System.out.println(count);

    }


}
