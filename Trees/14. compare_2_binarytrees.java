//Check if 2 binary trees are same or not
class Solution 
{
    public boolean isSameTree(TreeNode p, TreeNode q) 
    {
        if(p == null && q == null)
            return true;
        else if(p == null || q == null)
            return false;
        else
        {
            boolean a = isSameTree(p.left, q.left);
            boolean b = isSameTree(p.right, q.right);
            if(a == false || b == false)
                return false;
            return p.val==q.val;
        }
    }
}
