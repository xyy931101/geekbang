package week6;

/**
 * 647. 回文子串
 * @author xiongyayun
 * @description
 * @date 2021/5/6 16:07
 */
public class PalindromicSubstrings {

    public static void main(String[] args) {
        PalindromicSubstrings p = new PalindromicSubstrings();
        System.out.println(p.countSubstrings("abc"));
    }

    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;
        //构建dp数组
        boolean[][] dp = new boolean[s.length()][s.length()];

        char[] chars = s.toCharArray();
        int ans = 0;
        //j表示字符的长度
        for (int j = 0; j < s.length(); j++) {
            //i表示从那个字符开始
            for (int i = 0; i <= j; i++) {
                if (s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    ans++;
                }
            }
        }
        return ans;
    }
}
