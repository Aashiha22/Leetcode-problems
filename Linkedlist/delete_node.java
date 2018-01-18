//Delete node at a given position - iterative

Node Delete(Node head, int position) 
{
    if(position == 0)
        head = head.next;
    else
    {
        Node curr = head; 
        int i = 0;
        while(curr.next != null && i<position-1)
        {
            curr = curr.next;
            i = i + 1;
        }
        curr.next = curr.next.next;
    }
    return head;
}
