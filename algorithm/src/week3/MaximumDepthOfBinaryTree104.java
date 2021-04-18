package week3;

import common.TreeNode;

/**
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 * @Author: Xiongyy
 * @Date: 2021/4/16 23:02
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class MaximumDepthOfBinaryTree104 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return depthInTree(root);
    }

    public int depthInTree(TreeNode root) {
        //终止条件
        if (root == null) {
            return 0;
        }
        //获取左子树的最大深度
        int depthOnLeft = depthInTree(root.left);
        //获取右子树的最大深度
        int depthOnRight = depthInTree(root.right);
        //左右子树种的较大值+1
        return Math.max(depthOnLeft, depthOnRight) +1;
    }

}
