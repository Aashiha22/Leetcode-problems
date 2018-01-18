// Remove duplicates from unsorted linked list 

Node RemoveDuplicates(Node head) 
{
    HashSet<Integer> hs = new HashSet<Integer>();
    hs.add(head.data);
    Node curr = head.next;
    Node prev = head;
    while(curr != null)
    {
        if(hs.contains(curr.data))
        {
            prev.next = curr.next;
            curr = prev.next;
        }
        else
        {
            hs.add(curr.data);
            prev = curr;
            curr = curr.next;
        }
    }
    return head;
}
