// Reorder odd and even nodes in linked list

public ListNode oddEvenList(ListNode head) 
    {
        if(head == null)
            return head;
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode odd = oddHead;
        ListNode even = evenHead;
        while(even != null && even.next != null)
        {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return oddHead;
    }
