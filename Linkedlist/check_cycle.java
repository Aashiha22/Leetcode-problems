//Check if linkedlist has a cycle
boolean hasCycle(Node head) 
{
    Node fast = head;
    Node slow = head;
    while(fast != null && slow!=null && fast.next!=null)
    {
        fast = fast.next.next;
        slow = slow.next;
        if(fast == slow)
            return true;
    } 
    return false;
}

