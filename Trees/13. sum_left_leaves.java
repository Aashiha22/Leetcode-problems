// Find the sum of LEFT leaf nodes in binary tree:
class Solution 
{
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) 
    {
        if(root == null)
            return 0;
        else
        {
            if(root.left != null && root.left.left==null && root.left.right==null)
                sum = sum + root.left.val;
            sumOfLeftLeaves(root.left);
            sumOfLeftLeaves(root.right);
        }
        return sum;
    }
}
