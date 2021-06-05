package week8;

import common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 102. 二叉树的层序遍历
 * @author: xiongyayun
 * @date: 2021/6/2 10:12 下午
 */
public class BinaryTreeLevelOrderTraversal102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }

        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            int size = stack.size();
            List<Integer> level = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode pop = stack.pop();
                level.add(pop.val);

                if (pop.left != null) {
                    stack.addLast(pop.left);
                }
                if (pop.right != null) {
                    stack.addLast(pop.right);
                }
            }
            res.add(level);
        }
        return res;
    }


}
