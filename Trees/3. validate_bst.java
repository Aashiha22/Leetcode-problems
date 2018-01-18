//Inorder traversal method is ineffective as we must get traversal, store it in a data structure and check if the list obtained is sorted. Takes O(nlogn) times.

class Solution 
{
    public boolean isValidBST(TreeNode root) 
    {
        if(root == null)
            return true;
        return isBST(root,null,null);
    }
    public boolean isBST(TreeNode root, TreeNode left, TreeNode right)
    {
        if(root == null)
            return true;
        if(left != null && root.val<=left.val)
            return false;
        if(right != null && root.val>=right.val)
            return false;
        return isBST(root.left,left,root)&&isBST(root.right,root,right);
    }
    
}
