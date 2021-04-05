package common;

import java.util.ArrayList;
import java.util.List;

/**
 * N叉树
 * @Author: Xiongyy
 * @Date: 2021/4/5 14:14
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }


    public static Node getHeader(){
        Node root = new Node(1);

        List<Node> children = new ArrayList<>();
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        children.add(two);
        children.add(three);
        children.add(four);
        root.children = children;

        Node five = new Node(5);
        Node six = new Node(6);

        List<Node> children2 = new ArrayList<>(2);
        children2.add(five);
        children2.add(six);

        three.children = children2;
        return root;
    }
}
