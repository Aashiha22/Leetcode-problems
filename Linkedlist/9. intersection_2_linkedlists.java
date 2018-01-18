//Finding the intersection of 2 linked lists

public class Solution 
{
    public int getlength(ListNode curr)
    {
        int count = 0;
        while(curr !=null)
        {
            curr = curr.next;
            count++;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
            if(headA == null || headB == null)
                return null;
            int l1 = getlength(headA);
            int l2 = getlength(headB);
            int diff = Math.abs(l1-l2);
            if(l1 > l2)
            {
                while(diff > 0)
                {
                    headA = headA.next;
                    diff--;
                }
            }
            else if(l2 > l1)
            {
                while(diff > 0)
                {
                    headB = headB.next;
                    diff--;
                }
            }
            System.out.println(headA.val+"  "+headB.val);
            while(headA != null && headB!= null)
            {
                if(headA == headB)
                    return headA;
                else
                {
                    headA = headA.next;
                    headB = headB.next;
                }
            }
            return null;
    }
}
