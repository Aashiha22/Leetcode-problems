// Reverse m,n parts of linked list

class Solution {
    public void reverse(ListNode head)
    {
        if(head == null)
            return;
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null)
        {
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
    }
    public ListNode reverseBetween(ListNode head, int m, int n) 
    {
        if(head == null)
            return head;
        if(m==n)
            return head;
        ListNode prev = null;
        ListNode end = null;
        ListNode nxt = null;
        ListNode head1 = null;
        ListNode curr = head;
        int i = 1;
        while(curr != null)
        {
            if(i == m-1 && m>1)
                prev = curr;
            if(i == n)
            {
                end = curr;
                nxt = curr.next;
            }
            curr = curr.next;
            i++;
        }
        if(end != null)
            end.next = null;
        if(m == 1)
            head1 = head;
        else
            head1 = prev.next;
        reverse(head1);
        if(prev == null)
            head = end;
        else
            prev.next = end;
        head1.next = nxt;
        return head;
    }
}
