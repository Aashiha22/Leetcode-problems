int CompareLists(Node headA, Node headB) 
{
    if(headA == null && headB == null)
    {
        return 1;
    }
    else if(headA == null || headB == null)
    {
        return 0;
    }
    else
    {
        int a = CompareLists(headA.next, headB.next);    
        if(headA.data != headB.data)
            return 0;
        return a;
    }
}
