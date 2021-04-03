package week1;

/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * @Author: Xiongyy
 * @Date: 2021/4/3 9:59
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        //处理边界值
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int slow = 0, fast = 1;
        while (fast < nums.length) {
            if (nums[slow] != nums[fast]){
                //如果快慢指针不相等,则需要
                nums[slow + 1] = nums[fast];
                slow ++;
            }
            fast ++;
        }
        return slow + 1;
    }
}
