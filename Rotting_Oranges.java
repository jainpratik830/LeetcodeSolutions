import java.util.LinkedList;
import java.util.Queue;

public class Rotting_Oranges {

    public  static class Pair{
        int x,y;
        Pair(int a,int b){
            x=a;
            y=b;
        }
    }

    public static boolean isValid(int i,int j,int n,int m,boolean[][] visited,int[][] grid){

        if (i<n && i>=0 && j<m  && j>=0 && !visited[i][j] && grid[i][j]==1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] grid={{2,1,1},{1,1,0},{0,1,1}};

        Queue<Pair> queue=new LinkedList<>();
        int n=grid.length;
        if (n==0){
            return;
        }
        int m=grid[0].length;
        int i=0,j=0;
        boolean[][] visited=new boolean[n][m];
        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                if (grid[i][j]==2){
                    queue.offer(new Pair(i,j));

                }
            }
        }
        if (queue.isEmpty()){
            return;
        }
        queue.offer(null);

        int count =0;
        int[] x_coord={0,0,1,-1};
        int[] y_coord={1,-1,0,0};
        while (!queue.isEmpty()){

            Pair pair=queue.poll();
            if (pair==null){

                count++;
                if (queue.isEmpty()){
                    break;
                }else {
                    queue.offer(null);
                    continue;
                }

            }
            int x=pair.x;
            int y=pair.y;
            visited[x][y]=true;

            for (i=0;i<4;i++){
                if (isValid(x+x_coord[i],y+y_coord[i],n,m,visited,grid)){
                    queue.offer(new Pair(x+x_coord[i],y+y_coord[i]));
                    grid[x+x_coord[i]][y+y_coord[i]]=2;
                }
            }


        }
        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                if (grid[i][j]==1){
                    return;

                }
            }
        }


        System.out.println(count-1);

    }

}
