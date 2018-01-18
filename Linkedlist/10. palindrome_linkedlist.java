// Check if a linkedlist is palindrome

class Solution 
{
    ListNode left;
    public boolean isPalindrome(ListNode head) 
    {
        left = head;
        return isPal(head);
    }
    public boolean isPal(ListNode right)
    {
        if(right == null)
        {
            return true;
        }
    
        boolean a = isPal(right.next);
        if(a != true)
        {
            return false;
        } 
        boolean y = (left.val == right.val);
        left = left.next;
        
        return y;
        
    }
}
