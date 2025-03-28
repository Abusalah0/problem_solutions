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
    public ListNode deleteMiddle(ListNode head) {
        ListNode t1 = head;
        ListNode t2 = head;
        ListNode t3 = null;
        while(t2 != null && t2.next != null)
        {
            t3 = t1;
            t1 = t1.next;
            t2 = t2.next.next;
        }

        if(t3 != null)
            t3.next = t1.next;
        else
            head= head.next;
        return head;
    }
}