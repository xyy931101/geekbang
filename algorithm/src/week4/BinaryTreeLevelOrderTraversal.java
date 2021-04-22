package week4;

import common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 102. 二叉树的层序遍历
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 * @Author: Xiongyy
 * @Date: 2021/4/18 22:39
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class BinaryTreeLevelOrderTraversal {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        dfs(root, 1);
        return res;
    }

    /**
     * 深度优先
     */
    private void dfs(TreeNode root, int level) {
        //为空就没有必要走下去了
        if (root == null) {
            return;
        }
        if (res.size() <  level) {
            res.add(new LinkedList<>());
        }
        List<Integer> list = res.get(level - 1);

        list.add(root.val);
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }

    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal instance =new BinaryTreeLevelOrderTraversal();
        System.out.println(instance.bfs(TreeNode.getInstance()));
    }

    private List<List<Integer>> bfs(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            //构建同层的队列
            List<Integer> levelNode = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = deque.removeLast();
                levelNode.add(treeNode.val);
                if (treeNode.left != null) {
                    deque.push(treeNode.left);
                }
                if (treeNode.right != null) {
                    deque.push(treeNode.right);
                }
            }
            res.add(levelNode);
        }
        return res;
    }
}
