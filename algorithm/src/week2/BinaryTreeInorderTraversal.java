package week2;

import common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Xiongyy
 * @Date: 2021/4/5 14:55
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        process(result, root);
        return result;
    }

    public void process(List<Integer> result, TreeNode root){
        if(root == null){
            return;
        }
        process(result, root.left);
        result.add(root.val);
        process(result, root.right);
    }


    /**
     * 用迭代法
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        while (root != null || !stack.isEmpty()){
            //遍历所有的左子树
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            //把左子树的添加
            result.add(root.val);
            root = root.right;
        }

        return result;
    }

}
