//Merge 2 sorted linked lists
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode newe;
        if(l1.val < l2.val)
        {
            newe = l1;
            newe.next = mergeTwoLists(l1.next,l2);
        }
        else
        {
            newe = l2;
            newe.next = mergeTwoLists(l1, l2.next);
        }
    return newe;
    }
}
