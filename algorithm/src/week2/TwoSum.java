package week2;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Xiongyy
 * @Date: 2021/4/5 13:53
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class TwoSum {


    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length < 1){
            return new int[0];
        }

        //利用hashMap记录之前的字符的下标
        Map<Integer, Integer> indexMap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int sum = target - nums[i];
            if (indexMap.containsKey(sum)) {
                return new int[]{indexMap.get(sum), i};
            }else {
                indexMap.put(nums[i], i);
            }
        }
        return new int[0];
    }

}
