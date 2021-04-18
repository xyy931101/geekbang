package week3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 * @Author: Xiongyy
 * @Date: 2021/4/17 12:17
 * .............................................
 * 佛祖保佑             永无BUG
 *
 * 这个题目个整数排列的最大区别就是：
 *  全排序是整个不按照顺序来的，所以需要标识哪个有没有用到
 */
public class Combinations {

    public static void main(String[] args) {
        Combinations Combination = new Combinations();
        System.out.println(Combination.combine(4, 2));
    }

    //保留最终的结果
    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        //处理边界值
        if (n < 1 || k > n) {
            return new ArrayList<>();
        }

        //调用递归函数
        process(n, k, 1, new LinkedList<>());

        return res;
    }

    private void process(int n, int k, int index, LinkedList<Integer> path) {
        //如果里面已经有k个数了,则直接返回
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = index; i <= n - k + index; i++) {
            //吧当前path加上本身(这里是算上取当前数字的情况)
            path.add(i);
            //并且调用下一个数组的递归函数
            process(n, k, i + 1, path);
            //移除当前元素(这里是算不取当前元素的情况)
            path.removeLast();
        }
    }
}
