// Minimum Absolute Difference in BST

Code:
class Solution 
{
    int min_diff = Integer.MAX_VALUE, pre = -1, diff=0;
    public int getMinimumDifference(TreeNode root) 
    {
        inorder(root);
        return min_diff;
    }
    public void check(int val)
    {
        if(pre != -1)
        {
            diff = Math.abs(pre-val);
            if(diff < min_diff)
                min_diff = diff;   
        }
        pre = val;
    }
    public void inorder(TreeNode root)
    {
        if(root != null)
        {
            inorder(root.left);
            check(root.val);
            inorder(root.right);
        }
    }    
}
