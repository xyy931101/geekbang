package week3;

import common.TreeNode;

import java.util.HashMap;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 * @Author: Xiongyy
 * @Date: 2021/4/17 23:17
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    /**
     * 构建中序遍历中的数字跟下标的映射关系
     */
    HashMap<Integer, Integer> inorderMap = new HashMap<>();

    /**
     * 利用前序遍历的第一个节点是其中序遍历的跟节点
     * 中序遍历中,跟节点之前的是左子树的整个树,右边是右子树的整个树
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //处理边界值
        if (preorder == null || preorder.length < 0) {
            return null;
        }
        for (int i = 0; i < preorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return process(preorder, 0, preorder.length, inorder, 0, preorder.length);
    }


    private TreeNode process(int[] preorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd) {
        if (pStart == pEnd) {
            return null;
        }
        int root_val = preorder[pStart];
        TreeNode root = new TreeNode(root_val);
        int iRootIndex = inorderMap.get(root_val);
        //中序中,跟节点到开始节点的长度,就是整个左子树的长度
        int leftNum = iRootIndex - iStart;
        //其中根节点+左子树的长度，就是前序遍历中有子树的跟节点
        root.left = process(preorder, pStart + 1, pStart + leftNum + 1, inorder, iStart, iRootIndex);
        //拿到前序遍历中的右子树,然后分析出右子树的结构
        root.right = process(preorder, pStart + leftNum + 1, pEnd, inorder, iRootIndex + 1, iEnd);
        return root;
    }
}
