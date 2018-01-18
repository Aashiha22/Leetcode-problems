// Invert binary tree (left and right nodes)

class Solution 
{
    public TreeNode invertTree(TreeNode root) 
    {
        if(root == null)
            return null;
        else
        {
            TreeNode tmp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(tmp);
            return root;
        }
    }
}
