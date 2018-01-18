//Partition llinked list by value x
class Solution 
{
    public ListNode partition(ListNode head, int x) 
    {
        if(head == null)
            return null;
        ListNode curr = head;
        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(0);
        ListNode ptr1 = head1;
        ListNode ptr2 = head2;
        while(curr != null)
        {
            if(curr.val < x)
            {
                ptr1.next = curr;
                ptr1 = ptr1.next;
            }
            else
            {
                ptr2.next = curr;
                ptr2 = ptr2.next;
            }
            curr = curr.next;
        }
        ptr2.next = null;
        ptr1.next = head2.next;
        return head1.next;
    }
}
