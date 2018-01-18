//Print nth element from end
//Method 1 -> counting the length and getting element from length-n-1 position    
int GetNode(Node head,int n) 
{
    Node curr = head;
    int len = 0, i=0;
    while(curr != null)
    {
        curr = curr.next;
        len = len + 1;
    }
    curr = head;
    while(curr != null && i<len-n-1)
    {
        curr = curr.next;
        i = i + 1;
    }
    return curr.data;
}

//Method 2 -> have 2 pointers move 1 to n and move other till first reaches null    
int GetNode(Node head,int n) 
{
    int i = 0;
    Node curr = head;
    while(i<=n && curr!=null)
    {
        curr = curr.next;
        i = i + 1;
    }
    Node curr1 = head;
    while(curr != null)
    {
        curr = curr.next;
        curr1 = curr1.next;
    }
    return curr1.data;
}
