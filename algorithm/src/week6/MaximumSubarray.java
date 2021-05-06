package week6;

/**
 * 53. 最大子序和
 * @author xiongyayun
 * @description
 * @date 2021/5/6 10:33
 */
public class MaximumSubarray {

    public static void main(String[] args) {
        MaximumSubarray m = new MaximumSubarray();
        System.out.println(m.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    }

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int ans = nums[0], sum = 0;
        for (int num : nums) {
            //如果之前的和大于0,则说明有增益效果
            if (sum >= 0) {
                sum = sum + num;
            }else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    public int maxSubArray2(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i- 1] + nums[i], nums[i]);
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        return max;
    }
}
