//Reverse linked list - iterative
class Solution {
    public ListNode reverseList(ListNode head) 
    {
        ListNode curr = head;
        ListNode prev = null, nxt = null;
        while(curr != null)
        {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        head = prev;
        return head;
    }
}
