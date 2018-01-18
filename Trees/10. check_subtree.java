// Subtree of another tree

class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) 
    {
        if(s == null && t == null)
            return true;
        else if(s == null || t == null)
            return false;
        else
        {
            boolean a = check_subtree(s,t);
            if(a == true)
            {
                return true;
            }
            return isSubtree(s.left,t)||isSubtree(s.right,t);
        }
    }
    
    public boolean check_subtree(TreeNode s, TreeNode t)
    {
        if(s == null && t == null)
            return true;
        else if(s == null || t == null)
            return false;
        else
        {
            if(s.val != t.val)
                return false;
            return (check_subtree(s.left, t.left) && check_subtree(s.right, t.right));
        }
    }
}
