package week1;

import common.ListNode;

/**
 * @Author: Xiongyy
 * @Date: 2021/4/3 11:10
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        ListNode prev = new ListNode(0);
        ListNode temp = prev;
        while (l1 != null && l2 != null){
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            }else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if (l1 != null) {
            temp.next = l1;
        }
        if (l2 != null) {
            temp.next = l2;
        }
        return prev.next;
    }
}
