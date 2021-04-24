package week4;

/**
 * 利用贪心算法,只要后一天比前一天的高,就直接买
 * @Author: Xiongyy
 * @Date: 2021/4/24 17:21
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class BestTimeToBuyAndSellStockII {

    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }
        int maxProfit = 0;

        for (int i = 0; i < prices.length - 2; i++) {
            if (prices[i] < prices[i + 1]) {
                maxProfit = maxProfit +  prices[i + 1] - prices[i];
            }
        }
        return maxProfit;
    }
}
