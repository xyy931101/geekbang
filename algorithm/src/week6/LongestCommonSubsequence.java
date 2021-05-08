package week6;

/**
 * 1143. 最长公共子序列
 * @author xiongyayun
 * @date 2021/5/8 8:18
 */
public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        int M = text1.length() + 1;
        int N = text2.length() + 1;
        //边界值判断
        if (M == 0 || N == 0) return 0;
        int[][] dp = new int[M+1][N+1];
        for (int i = 1; i < M; i++) {
            for (int j = 1; j < N; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i - 1] [j], dp[i][j-1]);
                }
            }
        }

        return dp[M-1][N-1];
    }
}
