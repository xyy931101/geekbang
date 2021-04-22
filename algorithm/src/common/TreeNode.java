package common;

/**
 * 二叉树
 * 二叉树
 * @Author: Xiongyy
 * @Date: 2021/4/5 9:09
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public  TreeNode right;
    public  TreeNode() {}
    public  TreeNode(int val) { this.val = val; }
    public  TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }

     public static TreeNode getInstance(){
         TreeNode one = new TreeNode(1);
         TreeNode two = new TreeNode(2);
         TreeNode three = new TreeNode(2);
         one.left = two;
         one.right = three;
         TreeNode four = new TreeNode(3);
         TreeNode five = new TreeNode(4);
         two.left = four;
         two.right = five;
         TreeNode six = new TreeNode(4);
         TreeNode se = new TreeNode(3);
         three.left = six;
         three.right = se;
         return one;
     }
}
