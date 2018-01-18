//Remove cycle in linkedlist
//Return start element of cycle
public class Solution {
    public ListNode detectCycle(ListNode head) 
    {
        //Detect a cycle 
        ListNode slow = head;
        ListNode fast = head;
        while(slow != null && fast != null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                return removeCycle(fast, head);
            }
        }
        return null;
    }
    public ListNode removeCycle(ListNode fast, ListNode slow)
    {
        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
