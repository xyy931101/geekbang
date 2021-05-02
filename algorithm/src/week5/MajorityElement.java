package week5;

/**
 * @Author: Xiongyy
 * @Date: 2021/4/27 21:29
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        int cur = 0, count = 0;
        for (int num : nums) {
            if (count == 0) {
                cur = num;
            }
            if (num == cur) {
                count++;
            }else {
                count --;
            }
        }
        return cur;
       /* count = 0;
        //这里可以校验
        for (int num : nums) {
            if (num == cur) {
                count ++;
            }
        }
        return count > nums.length / 2 ? cur : -1;*/
    }
}
