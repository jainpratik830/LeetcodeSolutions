public class UniquePaths {

    public static int uniquePaths(int m, int n) {
        int[][] dp=new int[n][m];

        dp[0][0]=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0|| j==0){
                    dp[i][j]=1;
                }else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }

        return dp[n-1][m-1];

    }

    public static void main(String[] args) {
        uniquePaths(7,3);
    }


}
