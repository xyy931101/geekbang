package week3;

import common.TreeNode;

/**
 * 98. 验证二叉搜索树
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 *
 * 假设一个二叉搜索树具有如下特征：
 *
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 * @Author: Xiongyy
 * @Date: 2021/4/15 23:03
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class ValidateBinarySearchTree98 {

    private int prev = Integer.MIN_VALUE;

    /**
     * 利用二叉树的中序遍历
     */

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBST(root.left)) {
            return false;
        }
        // 如果当前节点小于等于中序遍历的前一个节点，说明不满足BST，返回 false；否则继续遍历。
        if (root.val <= prev) {
            return false;
        }
        prev = root.val;
        return isValidBST(root.right);
    }


}
