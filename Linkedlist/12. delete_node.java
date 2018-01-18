// Delete a node given access to that node only

class Solution 
{
    public void deleteNode(ListNode node) 
    {
        if(node.next == null)
        {
            node = null;
        }
        else
        {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
