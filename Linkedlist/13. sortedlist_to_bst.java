// Sorted linked list to BST

Method 1: O(n log n). Find the mid using fast slow pointer. Recursively find mid and make mid as root and construct left and right subtrees recursively.

class Solution 
{
    public TreeNode sortedListToBST(ListNode head) 
    {
        if(head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev == null)
        {
            head = null;
        }
        else
        {
            prev.next = null;
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        return root;
    }
}


Method 2: O(n). Insert and construct BST from sorted linked list elements in order. (Utilizing inorder property).

//Method 2 - inorder construction of BST

class Solution 
{
    ListNode head;
    public TreeNode sortedListToBST(ListNode head1) 
    {
        //count the number of number of nodes
        head = head1;
        int n=0;
        ListNode curr = head;
        while(curr != null)
        {
            curr = curr.next;
            n++;
        }
        TreeNode root = convert(n);
        return root;
    }
    
    public TreeNode convert(int n)
    {
        if(n<=0)
            return null;
        else
        {
            TreeNode left = convert(n/2);
            TreeNode root = new TreeNode(head.val);
            root.left = left;
            head = head.next;
            TreeNode right = convert(n-(n/2)-1);
            root.right = right;
            return root;
        }
    }
}
