//Swap pairs of linked list

class Solution 
{
    public ListNode swapPairs(ListNode head) 
    {
        if(head == null || head.next == null)
            return head;
        else
        {
            ListNode nxt = head.next;
            head.next = swapPairs(head.next.next);
            nxt.next = head;
            return nxt;
        }
    }
}
