import java.util.Arrays;

/**
 * Created by lisiyang on 17/7/2.
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/#/description
 * 121. Best Time to Buy and Sell Stock
 */
public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args){
        int[] prices = {7,1,5,3, 6, 4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        if (prices.length<2) return 0;

//        int[][] sortP = new int[prices.length][2];
//        for (int i = 0;i<prices.length;i++){
//            sortP[i][0] = i;
//            sortP[i][1] = prices[i];
//        }
//        Arrays.sort(sortP,(a,b)->b[1]-a[1]);
//        for (int[] i:sortP){
//            System.out.println(Arrays.toString(i));
//        }
//        int i=0,j=prices.length-1;
//        int maxP = 0;
//        while (i<j){
//            boolean pos = true;
//            if (sortP[i][0]==0)
//                i++;
//            if (sortP[j][0]!=prices.length-1)
//                j--;
//            if (sortP[i][0]>sortP[j][0]){
//                return Math.max(maxP,sortP[i][1]-sortP[j][1]);
//            }
//            else
//                if ( pos&&i<j)
//                    i++;
//                else if ( !pos&&i<j)
//                    j--;
//                else if (i==j && pos){
//                    i=0;
//                    pos=false;
//                }
//                else if (!pos && i==j)
//                    return 0;
//        }
        int maxP=0,res=0;
        for (int i=0;i<prices.length-1;i++){
//            for (int j=i+1;j<prices.length;j++){
//                maxP = Math.max(prices[j]-prices[i],maxP);
//            }
            maxP += prices[i+1]-prices[i];
            maxP = Math.max(0,maxP);
            res = Math.max(maxP,res);
        }
        return res;
    }
}
