package common;

/**
 * 链表
 * @Author: Xiongyy
 * @Date: 2021/4/3 11:10
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class ListNode {

    public int val;
    public ListNode next;
    public ListNode() {

     }
    public ListNode(int val) {
         this.val = val;
     }

    public ListNode(int val, ListNode next) {
         this.val = val; this.next = next;
     }
}
