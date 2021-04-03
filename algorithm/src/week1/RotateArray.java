package week1;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * @Author: Xiongyy
 * @Date: 2021/4/3 10:09
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class RotateArray {


    public void rotate(int[] nums, int k) {
        //处理边界值
        if (nums == nums || nums.length < 1 || k < 1) {
            return ;
        }
        k = k % nums.length;
        //如果K是数组长度的整数倍,直接返回
        if (k == 0) {
            return;
        }
        //先将整个数组翻转
        reverse(nums, 0, nums.length - 1);
        //在翻转k下标之前的
        reverse(nums, 0, k - 1);
        //在翻转k下标之后的
        reverse(nums, k, nums.length - 1);

    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}
