package week4.wudu;

import common.ListNode;

/**
 * 第二遍
 * @Author: Xiongyy
 * @Date: 2021/4/25 8:40
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class ReverseLinkedList206 {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {

            ListNode  next = cur.next;

            cur.next = prev;

            prev = cur;

            cur = next;

        }

        return prev;
    }
}
