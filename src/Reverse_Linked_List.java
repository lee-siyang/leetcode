/**
 * Created by lisiyang on 17/6/30.
 * https://leetcode.com/problems/reverse-linked-list/#/description
 * 206. Reverse Linked List
 */
public class Reverse_Linked_List {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.displayNode();
        ListNode pNode = head;
        for (int i = 2 ;i<=5;i++){
            ListNode newNode = new ListNode(i);
            pNode.next = newNode;
            pNode = newNode;
            pNode.displayNode();
        }
        System.out.println();
        ListNode newHead = reverseList(head);
//          newHead.displayNode();
        for (int i =1;i<=5;i++){
            newHead.displayNode();
            newHead = newHead.next;
        }
    }
    public static ListNode reverseList(ListNode head) {
        if (head!=null && head.next!=null) {
            ListNode chooseN = head;
//            ListNode exchangeN = null;
            while (chooseN != null && chooseN.next != null) {
                ListNode exchangeN = chooseN.next;
                chooseN.next = chooseN.next.next;
                exchangeN.next = head;
                head = exchangeN;
            }
        }
        return head;
    }
}
