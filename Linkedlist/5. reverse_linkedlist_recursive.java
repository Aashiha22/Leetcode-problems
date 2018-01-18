// Reverse linked list - recursive

Node Reverse(Node head) 
{
    Node r = Reverse(head, null);
    return r;
}
Node Reverse(Node curr, Node prev)
{
    if(curr == null)
        return null;
    else if(curr.next == null)
    {
        curr.next = prev;
        return curr;
    }
    Node r = Reverse(curr.next, curr);
    curr.next = prev;
    return r;
}
