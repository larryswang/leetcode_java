/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode temp=head.val;
        head = reverseList(head.next);
        reverseList(head.next) = head;
    }
}