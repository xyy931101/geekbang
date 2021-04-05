package week2;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的前序遍历
 * @Author: Xiongyy
 * @Date: 2021/4/5 9:06
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        process(result, root);
        return result;
    }

    private void process(List<Integer> result, TreeNode root){
        if (root != null){
            result.add(root.val);
        }
        //处理左子树
        process(result, root.left);
        //处理右子树
        process(result, root.right);
    }
}
