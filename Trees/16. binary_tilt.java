// Binary tilt

The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node values and the sum of all right subtree node values. Null node has tilt 0.
The tilt of the whole tree is defined as the sum of all nodes' tilt.

class Solution 
{
    int sum = 0, sum1=0;
    public int findTilt(TreeNode root) 
    {
        tilt(root);
        return sum;
    }
    
    public void tilt(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        else
        {
            tilt(root.left);
            tilt(root.right);
            int val1 = 0, val2 = 0;
            if(root.left != null)
            {
                sum1=0;
                find_sum(root.left);
                val1 = sum1;
            }
            if(root.right != null)
            {
                sum1 = 0;
                find_sum(root.right);
                val2 = sum1;
            }
            int diff = Math.abs(val1 - val2);
            sum = sum + diff;
        }
    }
    
    public void find_sum(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        else
        {
            find_sum(root.left);
            find_sum(root.right);
            sum1 = sum1 + root.val;
        }
    }
} 
