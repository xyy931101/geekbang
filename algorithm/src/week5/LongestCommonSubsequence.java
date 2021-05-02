package week5;

/**
 * @Author: Xiongyy
 * @Date: 2021/5/2 17:28
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        //其实这里可以不用做判断,题目里面已经给定了两个字符串不为空
        if (text1 == null || text2 == null || text1.length() < 1 ||text2.length() < 1) {
            return 0;
        }
        //减少-1的逻辑的判断
        int[][] dp = new int[text1.length() + 1][ text2.length() + 1];
        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    //如果当前两个字符相等,则为2个字符前一个的值 + 1
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else {
                    //如果不相等那就要看text1的前i个字符和text2的前j - 1个字符
                    //以及text1的前i - 1个字符和text2的前j个字符的最长公共子序列长度哪个大了
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j -1]);
                }

            }
        }
        return dp[text1.length()][text2.length()];
    }
}
