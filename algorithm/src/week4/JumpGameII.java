package week4;

/**
 * @Author: Xiongyy
 * @Date: 2021/4/24 19:27
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class JumpGameII {

    public int jump(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }

        return steps;
    }

    //动态规划
    public int jumpByDp(int[] nums) {
        if (nums == null) {
            return 0;
        }

        int[] dp = new int[nums.length];
        dp[0] = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int num = nums[i];
            int temp = 1;
            while (i + temp < nums.length && temp <= num) {
                if (dp[i + temp] != 0) {
                    dp[i + temp] = Math.min(dp[i] + 1, dp[i + temp]);
                }else {
                    dp[i + temp] = dp[i] + 1;
                }
                temp++;
            }
        }
        return dp[nums.length - 1];
    }
}
