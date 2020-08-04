import java.util.Arrays;

public class Surrounded_Regions {

    public static boolean isvalid(int n,int m,int i,int j,char[][] board){
        if (i<n && i>=0 && j<m && j>=0  && board[i][j]=='O'){
            return true;
        }
        return false;
    }

    public static void dfs(char[][] board,boolean[][] isValid,int i,int j,int n,int m){


        isValid[i][j]=true;
//
        int[] pos_x={0,0,1,-1};
        int[] pos_y={1,-1,0,0};


        for (int k=0;k<4;k++){
//            System.out.println("here");
            if (isvalid(n,m,i+pos_x[k],j+pos_y[k],board) && !isValid[i+pos_x[k]][j+pos_y[k]]){

                dfs(board,isValid,i+pos_x[k],j+pos_y[k],n,m);
            }

        }

//        visited[i][j]=false;


    }

    public static void main(String[] args) {
        char[][] board={{'X','O','X','O','X','O'},
                        {'O','X','O','X','O','X'},
                        {'X','O','X','O','X','O'},
                        {'O','X','O','X','O','X'}};

        int n=board.length;
        if (n==0){
            return;
        }
        int m=board[0].length;
        boolean[][] isValid=new boolean[n][m];

        for (int i=0;i<m;i++){

            if (board[0][i]=='O' && !isValid[0][i]){
                dfs(board,isValid,0,i,n,m);
            }
            if (board[n-1][i]=='O' && !isValid[n-1][i]){
                dfs(board,isValid,n-1,i,n,m);
            }

//            for
        }



        for (int i=0;i<n;i++){
            if (board[i][0]=='O' && !isValid[i][0]){
                dfs(board,isValid,i,0,n,m);
            }
            if (board[i][m-1]=='O' && !isValid[i][m-1]){
                dfs(board,isValid,i,m-1,n,m);
            }
        }



        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (isValid[i][j]){
                    board[i][j]='O';
                }else {
                    board[i][j]='X';
                }
            }
        }
        String a="Deege";


        for(char[] arr:board)
            System.out.println(Arrays.toString(arr));


    }
}
