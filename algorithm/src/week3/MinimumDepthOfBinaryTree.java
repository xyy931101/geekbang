package week3;

import common.TreeNode;

/**
 * 111. 二叉树的最小深度
 * @Author: Xiongyy
 * @Date: 2021/4/16 23:08
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class MinimumDepthOfBinaryTree {

    /**
     * 最大深度的镜像问题
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //1.左孩子和有孩子都为空的情况，说明到达了叶子节点，直接返回1即可
        if(root.left == null && root.right == null) {
            return 1;
        }

        int leftMin = minDepth(root.left);
        int rightMin = minDepth(root.right);

        //如果只有其中一个子树为空,则要取比较大的那个
        if(root.left == null || root.right == null) {
            return Math.max(leftMin, rightMin) + 1;
        }
        return Math.min(leftMin, rightMin) + 1;
    }
}
