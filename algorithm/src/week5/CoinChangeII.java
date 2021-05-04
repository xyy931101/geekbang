package week5;

import java.util.Arrays;
import java.util.Collections;

/**
 * 518. 零钱兑换 II
 * @Author: Xiongyy
 * @Date: 2021/5/3 21:09
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class CoinChangeII {

    public static void main(String[] args) {
        CoinChangeII c = new CoinChangeII();
        System.out.println(c.change(5, new int[] {1, 2, 5}));
    }

    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        Arrays.sort(coins);
        for (int i = 1; i <= amount; i++) {
            int count = 0;
            //枚举硬币
            for (int coin : coins){
                // coin不能大于amount
                if (i < coin) {
                    continue;
                }
                dp[i] += dp[i-coin];
            }
        }
        return dp[amount];
    }
}
