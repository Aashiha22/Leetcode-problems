int CompareLists(Node headA, Node headB) 
{
    if(headA==null && headB==null)
        return 1;
    else if(headA == null || headB == null)
        return 0;
    else
    {
        while(headA != null && headB!=null)
        {
            if(headA.data != headB.data)8
                return 0;
            headA = headA.next;
            headB = headB.next;
        }
        if(headA!=null || headB!=null)
            return 0;
    }
    return 1;
}

