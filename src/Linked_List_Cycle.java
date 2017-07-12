/**
 * Created by lisiyang on 17/7/11.
 * https://leetcode.com/problems/linked-list-cycle/#/description
 * 141. Linked List Cycle
 */
public class Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        if (head==null) return false;
        ListNode evenHead = head;
        ListNode oddHead = head;
        while (evenHead.next != null
                && evenHead.next.next != null){
            evenHead = evenHead.next.next;
            oddHead = oddHead.next;
            if (oddHead == evenHead){
                return true;
            }
        }
        return false;
    }
}
