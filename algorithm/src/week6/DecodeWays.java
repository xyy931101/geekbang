package week6;

/**
 * 91. 解码方法
 * @author xiongyayun
 * @description
 * @date 2021/5/6 11:18
 */
public class DecodeWays {

    public static void main(String[] args) {
        DecodeWays d = new DecodeWays();
        System.out.println(d.numDecodings("27"));
        System.out.println('2' - '0' * 10 );
        System.out.println('7' - '0');
    }

    public int numDecodings(String s) {
        if(s.charAt(0) == '0'){
            return 0;
        }
        int [] dp = new int[s.length() + 1];
        char[] chars = s.toCharArray();
        dp[0] = 1;
        for (int i = 1; i <= chars.length; i++) {
            int a = chars[i] - '0', b = (chars[i - 1] - '0') * 10 + (chars[i] - '0');
            if (1 <= a && a <= 9) dp[i] = dp[i - 1];
            if (10 <= b && b <= 26) dp[i] += dp[i - 2];
        }
        return dp[s.length()];
    }
}
