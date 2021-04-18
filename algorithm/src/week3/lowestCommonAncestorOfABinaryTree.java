package week3;

import common.TreeNode;

/**
 * 236. 二叉树的最近公共祖先
 * @Author: Xiongyy
 * @Date: 2021/4/16 23:26
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class lowestCommonAncestorOfABinaryTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //如果只要包含其中一个,就可以返回了(如果没有节点,也是直接返回)
        if(root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null && right == null) {
            return null;
        }
        //左子树为空的时候,返回右子树
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;
    }
}
