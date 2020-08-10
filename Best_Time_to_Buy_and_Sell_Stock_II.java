import java.util.Arrays;

public class Best_Time_to_Buy_and_Sell_Stock_II {

    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }

        int i = 0, valley = prices[0], peak = prices[0], max = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                ++i;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                ++i;
            peak = prices[i];
            max += peak - valley;

        }

        int[] arr={1,2,3};


        return max;
    }

}
