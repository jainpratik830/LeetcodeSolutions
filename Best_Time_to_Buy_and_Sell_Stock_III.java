public class Best_Time_to_Buy_and_Sell_Stock_III {

    public int maxProfit(int[] prices) {
        int s1=-prices[0],s2=Integer.MIN_VALUE,s3=Integer.MIN_VALUE,s4=Integer.MIN_VALUE;

        for(int i=1;i<prices.length;i++){
            s1=Math.max(s1,-prices[i]);
            s2=Math.max(s2,s1+prices[i]);
            s3=Math.max(s3,s2-prices[i]);
            s4=Math.max(s4,s3+prices[i]);

        }

        return Math.max(0,s4);


    }

}
