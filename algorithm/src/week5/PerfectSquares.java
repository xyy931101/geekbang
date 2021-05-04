package week5;

/**
 * @Author: Xiongyy
 * @Date: 2021/5/3 21:01
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class PerfectSquares {

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            //这里做最坏的打算,即:n个1相加
            dp[i] = i;
            for (int j = 0; i - j * j >= 0; j++) {
                //取减去一个平方数之后，前面的最小值
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n +1];
    }
}
