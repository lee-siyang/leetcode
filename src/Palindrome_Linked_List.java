/**
 * Created by lisiyang on 17/7/19.
 * https://leetcode.com/problems/palindrome-linked-list/#/description
 * 234. Palindrome Linked List
 */
public class Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {

        ListNode oneStep = head;
        ListNode twoSteps = head;
        while (twoSteps!=null && twoSteps.next!=null){
            oneStep = oneStep.next;
            twoSteps = twoSteps.next.next;
        }
        if (twoSteps!=null){
            oneStep=oneStep.next;
        }

        oneStep = reverse(oneStep);
        twoSteps = head;
        while (oneStep!=null){
            if (oneStep.val!=twoSteps.val){
                return false;
            }
            oneStep = oneStep.next;
            twoSteps = twoSteps.next;
        }
        return true;

//        ListNode newHead = oneStep.next;
//        while (newHead.next!=null){
//
//        }
    }
    public ListNode reverse(ListNode head){
        ListNode reNode = null;
        while (head!=null){
            ListNode temp = head.next;
            head.next = reNode;
            reNode = head;
            head = temp;

        }
        return reNode;
    }
}
