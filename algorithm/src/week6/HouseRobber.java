package week6;

/**
 * @author xiongyayun
 * @description
 * @date 2021/5/6 16:23
 */
public class HouseRobber {

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        //避免回0
        int[] dp = new int[nums.length + 1];
        dp[1] = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i -2] + nums[i - 1]);
        }
        return dp[nums.length];
    }
}
