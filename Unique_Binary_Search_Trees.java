public class Unique_Binary_Search_Trees {

    public static int numTrees(int n) {

        if(n==1){
            return 1;
        }

        int[] dp=new int[n+1];

        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){

                dp[i]+= dp[j]*dp[i-j-1];

            }
        }


        return dp[n];
    }


    public static void main(String[] args) {

        numTrees(5);
    }

}
