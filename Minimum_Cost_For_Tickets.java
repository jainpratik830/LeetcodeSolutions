public class Minimum_Cost_For_Tickets {

    int[] dp;

    public int cost(int[] days,int[] cost,int i){

        if(i>=days.length){
            return 0;
        }

        if(dp[i]!=0){
            return dp[i];
        }


        int a=cost[0]+cost(days,cost,i+1);

        int j=i;
        for(j=i+1;j<days.length;j++){
            if(days[j]-days[i]>=7){

                // System.out.println(a+" "+i+" "+j);
                break;
            }
        }
        int b=cost[1]+cost(days,cost,j);

        j=i;
        for(j=i+1;j<days.length;j++){
            if(days[j]-days[i]>=30){
                break;

            }
        }
        int c=cost[2]+cost(days,cost,j);


        return dp[i]=Math.min(a,Math.min(b,c));


    }


    public int mincostTickets(int[] days, int[] costs) {
        dp=new int[days.length];
        return cost(days,costs,0);
    }

}
