package week9;

/**
 * @author: xiongyayun
 * @date: 2021/6/8 9:33 下午
 */
public class HouseRobber {

    public int rob(int[] nums) {
        //边界值判断
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int[] dp = new int[length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1], nums[0]);
        //baseCase
        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[length - 1];
    }

}
