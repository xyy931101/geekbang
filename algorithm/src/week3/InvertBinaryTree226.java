package week3;

import common.TreeNode;

/**
 * 226. 翻转二叉树
 * @Author: Xiongyy
 * @Date: 2021/4/15 23:55
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class InvertBinaryTree226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        //遍历左子树
        TreeNode left = invertTree(root.left);
        //遍历右子树
        TreeNode right = invertTree(root.right);
        //开始交换
        root.left = right;
        root.right = left;
        return root;
    }
}
