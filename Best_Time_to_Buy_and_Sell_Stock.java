public class Best_Time_to_Buy_and_Sell_Stock {

    public int maxProfit(int[] prices) {
        if(prices.length<=1){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        int max=0;

        for(int i:prices){
            if(i<min){
                min=i;
            }
            else if(i-min>max)
                max=i-min;
        }



        return max;

    }

}
