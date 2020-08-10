import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Path_Sum_2 {

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

    public class Point{
        TreeNode node;
        ArrayList<Integer> list=new ArrayList<>();
        Point(TreeNode node,ArrayList<Integer> number){
            this.node=node;
            list=number;
        }


    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        // TreeNode root=new TreeNode();
        List<List<Integer>> li=new ArrayList<>();
        if(root==null){
            return li;
        }
        Queue<Point> queue=new LinkedList<>();
        ArrayList<Integer>  c=new ArrayList<>();
        c.add(root.val);
        queue.offer(new Point(root,c));

        int count =0;
        while (!queue.isEmpty()){

            Point p=queue.poll();
            TreeNode node=p.node;
            ArrayList<Integer> x=p.list;
            if (node.left==null && node.right==null){
                // x.add(node.val);
                int s=0;
                for(int i:x){
                    s+=i;
                }
                if (s==sum)
                    li.add(x);
            }
            if (node.left!=null) {
                x.add(node.left.val);
                queue.offer(new Point(node.left, (ArrayList<Integer>)x.clone()));
                x.remove(x.size()-1);
            }
            if (node.right!=null) {
                x.add(node.right.val);
                queue.offer(new Point(node.right,(ArrayList<Integer>) x.clone()));
                x.remove(x.size()-1);
            }

        }

        return li;

    }
}
