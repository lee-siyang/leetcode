/**
 * Created by lisiyang on 17/6/28.
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/#/description
 * 122. Best Time to Buy and Sell Stock II
 */
public class Best_Time_to_Buy_and_Sell_Stock_II {
    public static void main(String[] args) {
        int[] prices = {2,4,3,2,1,1,2,4,5,1};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int profit=0;
        for (int i =1;i<prices.length;i++){
            profit += Math.max(prices[i]-prices[i-1],0);
        }
        return profit;
    }
}
