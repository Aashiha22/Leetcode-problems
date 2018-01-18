/* Is tree symmetric or not:

Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
Code:   */

class Solution 
{
    public boolean isSymmetric(TreeNode root) 
    {
        if(root == null)
            return true;
        else
        {
            return check(root.left, root.right);
        }
    }
    
    public boolean check(TreeNode left, TreeNode right)
    {
        if(left == null && right == null)
            return true;
        else if(left == null || right == null)
            return false;
        else if(left.val != right.val)
            return false;
        else
        {
            return check(left.left, right.right)&&check(left.right, right.left);
        }
    }
}
