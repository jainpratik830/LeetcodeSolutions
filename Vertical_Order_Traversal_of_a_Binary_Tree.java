import java.lang.reflect.Array;
import java.util.*;

public class Vertical_Order_Traversal_of_a_Binary_Tree {

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
        int[] point=new int[3];
        Point(int x,int y,int val){
            point[0]=x;
            point[1]=y;
            point[2]=val;
        }

    }

    public static void dfs(TreeNode node,ArrayList<Point> list,int x,int y){

        if (node==null){
            return;
        }
//        int x=0,y=0;



        if (node.left!= null){
            dfs(node.left,list,x-1,y-1);
            list.add(new Point(x-1,y-1,node.left.val));
        }
        if (node.right!= null){
            dfs(node.right,list,x+1,y-1);
            list.add(new Point(x+1,y-1,node.right.val));
        }



    }

    public static void main(String[] args) {


        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);

        ArrayList<Point> list=new ArrayList<>();
        list.add(new Point(0,0,root.val));
        dfs(root,list,0,0);


        Collections.sort(list, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.point[0]!=o2.point[0]){
                    return o1.point[0]-o2.point[0];
                }
                if (o2.point[1]!=o1.point[1]){
                    return o2.point[1]-o1.point[1];
                }
                return o1.point[2]-o2.point[2];
            }
        });
        List<List<Integer>> res=new ArrayList<>();
        int x=list.get(0).point[2];
        List<Integer> r=new ArrayList<>();
        r.add(x);
        res.add(r);
        for (int i=1;i<list.size();i++) {
            if (list.get(i-1).point[0]==list.get(i).point[0]){
                res.get(res.size()-1).add(list.get(i).point[2]);
            }else {
                List<Integer> re=new ArrayList<>();
                re.add(list.get(i).point[2]);
                res.add(re);
            }
        }

        System.out.println(res);
    }


}
