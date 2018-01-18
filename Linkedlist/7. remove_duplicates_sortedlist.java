//Remove duplicates from sorted linkedlist
class Solution {
    public ListNode deleteDuplicates(ListNode head) 
    {
        if(head == null)
            return head;
        ListNode curr = head.next;
        ListNode prev = head;
        while(curr != null)
        {
            if(curr.val == prev.val)
            {
                prev.next = curr.next;
                curr = prev.next;
            }
            else
            {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}
