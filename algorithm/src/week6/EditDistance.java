package week6;

/**
 * 72. 编辑距离
 * @author xiongyayun
 * @date 2021/5/6 22:39
 */
public class EditDistance {

    public static void main(String[] args) {
        System.out.println(minDistance("horse", "ros"));
    }

    public static int minDistance(String word1, String word2) {
        int row = word1.length() + 1;
        int cell = word2.length() + 1;
        int[][] dp = new int[row][cell];
        //BaseCase
        for (int i = 0; i < cell; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i < row; i++) {
            dp[i][0] = i;
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < cell; j++) {
                //如果两个字符相等
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i -1][j -1];
                }else {
                    //两个不相等
                    //dp[i - 1][j - 1]表示前面两个子串已经相等,那么不管word1的第i个字符是啥,只要替换就可以看
                    //dp[i][j - 1] 表示时word1的0~i位置只是和word2的0~j-1位置匹配, 此时只需要在原来的i位置后面插入一个和word2的j位置相同的字符使得
                    // 此时的word1的0~i(这个i是执行了插入操作后新的i)和word2的0~j匹配得上
                    //dp[i - 1][j] 此时word1的0~i-1位置与word2的0~j位置已经匹配了,
                    //此时多出了word1的i位置字符,应把它删除掉,才能使此时word1的0~i(这个i是执行了删除操作后新的i)
                    //和word2的0~j位置匹配,因此此时dp[i][j]=dp[i-1][j]+1(这个加1代表执行删除操作)
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i][j - 1]), dp[i - 1][j]) + 1;
                }
            }
        }


        return dp[row - 1][cell - 1];
    }
}
