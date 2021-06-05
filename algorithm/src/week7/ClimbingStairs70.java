package week7;

/**
 * 70. 爬楼梯
 * @author: xiongyayun
 * @date: 2021/5/31 10:55 下午
 */
public class ClimbingStairs70 {

    public int climbStairs(int n) {
        if (n <= 1) {
            return n;
        }
        int[] dp = new int[n + 1];
        //baseCase
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}
