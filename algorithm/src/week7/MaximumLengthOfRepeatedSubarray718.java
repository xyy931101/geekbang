package week7;

/**
 * 718. 最长重复子数组
 * @author: xiongyayun
 * @date: 2021/5/30 15:05
 */
public class MaximumLengthOfRepeatedSubarray718 {


    public int findLength(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return 0;
        }
        int m = nums1.length;
        int n = nums2.length;
        int[][] dp = new int[m + 1][n + 1];
        int ans = 0;
        for (int i = m - 1; i >= 0; i--) {

            for (int j = n - 1; j >= 0; j --) {
                dp[i][j] = nums1[i] == nums2[j] ? dp[i + 1][j + 1] + 1 : 0;
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
    }

}
