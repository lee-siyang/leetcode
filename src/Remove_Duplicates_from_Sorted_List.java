
/**
 * Created by lisiyang on 17/7/5.
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/#/description
 * 83. Remove Duplicates from Sorted List
 */
public class Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode thisNode = head;
//        ListNode nextNode = head.next;
        while (thisNode!=null ){
            if (thisNode.next==null)break;
            if (thisNode.val==thisNode.next.val){
                thisNode.next=thisNode.next.next;
            }
            else thisNode=thisNode.next;
        }
        return head;
    }
}
