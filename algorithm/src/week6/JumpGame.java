package week6;

/**
 * 55. 跳跃游戏
 * @author xiongyayun
 * @description
 * @date 2021/5/6 17:51
 */
public class JumpGame {

    public boolean canJump(int[] nums) {
        //边界值的判断
        if (nums == null ||nums.length == 0) return true;

        int k = 0;
        for (int i = 0; i <= k; i++) {
            //第i个元素能够跳到的最远距离
            int temp = i + nums[i];
            //更新最远距离
            k = Math.max(k, temp);
            //如果最远距离已经大于或等于最后一个元素的下标,则说明能跳过去,退出. 减少循环
            if (k >= nums.length - 1) {
                return true;
            }
        }
        //最远距离k不再改变,且没有到末尾元素
        return false;
    }
}
