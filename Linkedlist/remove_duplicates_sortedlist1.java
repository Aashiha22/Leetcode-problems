// Remove and delete duplicates from sorted linked list

public ListNode deleteDuplicates(ListNode head) 
    {
        if(head == null)
            return null;
        ListNode fp = new ListNode(0);
        fp.next = head;
        ListNode curr = head;
        ListNode prev = fp;
        while(curr != null)
        {
            while(curr.next != null && curr.val==curr.next.val)
            {
                curr = curr.next;
            }
            if(prev.next == curr)
            {
                prev = prev.next;
            }
            else
            {
                prev.next = curr.next;
            }
            curr = curr.next;
        }
        return fp.next;
    }
