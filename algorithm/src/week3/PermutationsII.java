package week3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 全排列 II
 * @Author: Xiongyy
 * @Date: 2021/4/18 12:51
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class PermutationsII {

    public static void main(String[] args) {
        PermutationsII ps = new PermutationsII();
        System.out.println(ps.permuteUnique(new int[]{1,1,2}));
    }


    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums == null || nums.length < 1) {
            return res;
        }
        //先将数组排序,方便后续去重
        Arrays.sort(nums);
        //用来标识又没有用到
        boolean[] used = new boolean[nums.length];
        process(nums, 0, new LinkedList<>(), used);
        return res;
    }

    private void process(int[] nums, int index, LinkedList<Integer> path, boolean[] used) {
        //终止条件
        if (path.size() == nums.length) {
            res.add(new LinkedList<>(path));
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            // 剪枝条件：i > 0 是为了保证 nums[i - 1] 有意义
            // 写 !used[i - 1] 是因为 nums[i - 1] 在深度优先遍历的过程中刚刚被撤销选择
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            path.add(nums[i]);
            used[i] = true;
            process(nums, i + 1, path, used);
            used[i] = false;
            path.removeLast();
        }
    }
}
