class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode iterator = new ListNode(0);
        ListNode i = l1, j = l2, curr = iterator;
        int carry = 0;
        while(i != null || j != null)
        {
            int x = (i != null) ? i.val : 0;
            int y = (j != null) ? j.val : 0;
            int sum = x + y + carry;
            carry = sum /10;

            curr.next = new ListNode(sum % 10);

            curr = curr.next;
            if (i != null)
                i = i.next;
            
            if (j != null)
                j = j.next;

            
        }

        if(carry > 0)
            curr.next = new ListNode(carry);

            return iterator.next;
       
       
    }
}
