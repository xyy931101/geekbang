package week2;


import common.Node;

import java.util.*;

/**
 * 给定一个 N 叉树，返回其节点值的 前序遍历 。
 *
 * N 叉树 在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔
 * @Author: Xiongyy
 * @Date: 2021/4/5 14:12
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class nAryTreePreorderTraversal {

    //1.利用递归(感觉这个有点过于简单了)
    public List<Integer> preorder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> res = new ArrayList<>();
        process(res, root);
        return res;
    }

    private void process(List<Integer> res, Node root) {
        if (root != null) {
            res.add(root.val);
            if (root.children != null) {
                for (Node child : root.children) {
                    process(res, child);
                }
            }
        }
    }


    public static void main(String[] args) {
        nAryTreePreorderTraversal n = new nAryTreePreorderTraversal();

        System.out.println(n.preorder2(Node.getHeader()));
    }

    //
    public List<Integer> preorder2(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> res = new ArrayList<>();
        Deque<Node> deque = new LinkedList();
        deque.add(root);
        //构建先进先出队列
        while (!deque.isEmpty()){
            Node poll = deque.pollLast();
            res.add(poll.val);
            if (poll.children != null){
                for (Node child : poll.children) {
                    if (child != null) {
                        deque.add(child);
                    }
                }
            }
        }
        return res;
    }


}
