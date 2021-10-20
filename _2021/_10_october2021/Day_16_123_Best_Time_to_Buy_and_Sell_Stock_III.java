public class Day_16_123_Best_Time_to_Buy_and_Sell_Stock_III {
    class Solution {
        public int maxProfit(int[] prices) {
            if(prices == null || prices.length <= 1) return 0;
            int len = prices.length;
            int[][] buys = new int[len + 1][3];
            int[][] sells = new int[len + 1][3];
            buys[1][1] = -prices[0];
            buys[1][2] = Integer.MIN_VALUE;
            for(int i = 2; i <= len; i++){
                for(int j = 1; j <= 2; j++){
                    buys[i][j] = Math.max(buys[i - 1][j], sells[i - 1][j - 1] - prices[i - 1]);
                    sells[i][j] = Math.max(sells[i - 1][j], buys[i - 1][j] + prices[i - 1]);
                }
            }
            return Math.max(sells[len][0], Math.max(sells[len][1], sells[len][2]));
        }
    }
}