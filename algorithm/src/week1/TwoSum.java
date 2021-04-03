package week1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Xiongyy
 * @Date: 2021/4/3 11:25
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //处理边界值
        if(nums == null ||nums.length < 2) {
            return new int[] {};
        }
        //采用hashMap存储可能存在的数字
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for(int i = 0; i< nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
