package week5.fivedu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 15. 三数之和
 * @Author: Xiongyy
 * @Date: 2021/4/27 22:14
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class ThreeSum {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> threeSum(int[] nums) {
        //如果数组长度小于3,则就返回空数组
        if(nums == null || nums.length < 3){
            return ans;
        }
        int length = nums.length;
        //因为要去重,所以,先对数组进行牌程序
        Arrays.sort(nums);
        //遍历数组,找出符合条件的数组

        for (int i = 0; i < length - 2; i++) {


        }
        return ans;
    }



}
