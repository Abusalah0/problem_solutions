/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode t1 = head;
        ListNode t2 = head.next;
        ListNode t3 = t2.next;
        while(t3 != null)
        {
            t2.next = t1;
            t1 = t2;
            t2 = t3;
            t3 = t3.next;
        }
        t2.next = t1;
        head.next = null;
        head = t2;
        return head;
    }
}