public class Best_Time_to_Buy_and_Sell_Stock_IV {

    public int maxProfit(int k, int[] prices) {

        if(prices.length==0 || prices.length==1){
            return 0;
        }

        if(k>=prices.length){

            int i=0,valley=prices[0],peak=prices[0],max=0;
            while(i<prices.length-1){
                while(i<prices.length-1 && prices[i]>=prices[i+1])
                    i++;
                valley=prices[i];
                while(i<prices.length-1 && prices[i]<=prices[i+1])
                    i++;
                peak=prices[i];
                max+=peak-valley;

            }

            return max;


        }

        int[] curr=new int[prices.length];
        int[] prev=new int[prices.length];

        for(int i=1;i<=k;i++){

            int maxDiff=-prices[0];
            for(int j=1;j<prices.length;j++){

                curr[j]=Math.max(curr[j-1],maxDiff+prices[j]);
                maxDiff=Math.max(maxDiff,prev[j]-prices[j]);

            }

            for(int j=0;j<prices.length;j++){
                prev[j]=curr[j];
            }

        }

        return curr[prices.length-1];
    }

}
