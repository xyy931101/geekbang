package week4;

/**
 * @Author: Xiongyy
 * @Date: 2021/4/24 17:25
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class JumpGame {

    public static void main(String[] args) {
        JumpGame jg = new JumpGame();
        jg.canJump(new int[] {0});
    }


    public boolean canJump(int[] nums) {
        if (nums == null) {
            return false;
        }
        //前n-1个元素能够跳到的最远距离
        int k = 0;
        for (int i = 0; i <= k; i++) {
            //第i个元素能够跳到的最远距离
            int temp = i + nums[i];
            //更新最远距离
            k = Math.max(temp, k);

            //如果最远距离已经大于或等于最后一个元素的下标,则说明能跳过去,退出. 减少循环
            if (k >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
