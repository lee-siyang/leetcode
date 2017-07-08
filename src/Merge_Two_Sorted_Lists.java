/**
 * Created by lisiyang on 17/7/8.
 * https://leetcode.com/problems/merge-two-sorted-lists/#/description
 * 21. Merge Two Sorted Lists
 */
public class Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head = l1.val<l2.val?l1:l2;
        ListNode nextNode = l1.val<l2.val?l2:l1;
        head.next = mergeTwoLists(head.next,nextNode);
        return head;
    }
}
