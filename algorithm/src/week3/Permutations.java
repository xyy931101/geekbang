package week3;

import java.util.LinkedList;
import java.util.List;

/**
 * 全排列
 * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 * @Author: Xiongyy
 * @Date: 2021/4/18 11:26
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class Permutations {

    public static void main(String[] args) {
        Permutations ps = new Permutations();

        System.out.println(ps.permute(new int[]{1,2,3}));
    }


    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        //先处理边界值
        if (nums == null || nums.length < 1) {
            return res;
        }
        boolean[] used = new boolean[nums.length];
        process(nums, 0, new LinkedList<>(), used);
        return res;
    }

    public void process(int[] nums, int index, LinkedList<Integer> path, boolean[] used) {
        //如果长度一致,则没有必要在进行下去了
        if (path.size() == nums.length) {
            res.add(new LinkedList<>(path));
        }
        //处理程序
        for (int i = 0; i < nums.length; i++) {
            //这里
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                process(nums, i + 1, path, used);
                path.removeLast();
                used[i] = false;
            }
        }
    }
}
