package week4;

import common.TreeNode;

import java.util.*;

/**
 * @Author: Xiongyy
 * @Date: 2021/4/24 19:45
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class FindLargestValueInEachTreeRow {

    //BFS
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> largest = new LinkedList<>();
        if (root == null) {
            return largest;
        }

        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            int size = stack.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode node = stack.removeLast();
                max = Math.max(node.val, max);
                if (node.left !=null) {
                    stack.push(node.left);
                }
                if (node.right != null) {
                    stack.push(node.right);
                }
            }
            largest.add(max);
        }

        return largest;
    }

   List<Integer> ans = new LinkedList<>();

    public List<Integer> largestValueByDfs(TreeNode root) {
        List<Integer> largest = new LinkedList<>();
        if (root == null) {
            return largest;
        }
        process(root, 1);
        return ans;
    }

    public void process(TreeNode root, int level){
        if (root == null) {
            return;
        }

        if (level == ans.size() + 1) {
            ans.add(root.val);
        }else {
            ans.set(level - 1, Math.max(ans.get(level - 1), root.val));
        }
        //深度遍历
        process(root, level + 1);
        process(root, level + 1);
    }
}
