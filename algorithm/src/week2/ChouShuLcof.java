package week2;

/**
 * 我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。
 * 求按从小到大的顺序的第 n 个丑数。
 * @Author: Xiongyy
 * @Date: 2021/4/5 15:24
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class ChouShuLcof {

    public int nthUglyNumber(int n) {
        //处理边界值
        if (n < 0) {
            return 0;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        for (int i = 1; i < n; i++) {
            //取能整除2,3,5的最小值
            dp[i] = Math.min(Math.min(dp[index2] * 2, dp[index3] * 3), dp[index5] * 5);
            //如果能整除2,则证明是2整除上来的,2的最大下标为需要往后挪一位
            if (dp[i] == dp[index2] * 2){
                index2++;
            }
            //如果能整除3,则证明是3整除上来的,3的最大下标为需要往后挪一位
            if (dp[i] == dp[index3] * 3){
                index3++;
            }
            if (dp[i] == dp[index5] * 5){
                index5++;
            }
        }
        return dp[n - 1];
    }
}
