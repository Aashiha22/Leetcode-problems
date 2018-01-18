// Find second minimum value of binary tree:

class Solution 
{
    int min = 0, sec_min = 0;
    public int findSecondMinimumValue(TreeNode root) 
    {
        min = root.val;
        sec_min = root.val;
        if(root == null) 
            return -1;
        else
        {
            int val = findmin(root);
            if(min == sec_min)
                return -1;
            else
                return val;
        }
    }
    public int findmin(TreeNode root)
    {
        if(root.left == null && root.right == null)
            return root.val;
        else	
        {
            int v = findmin(root.left);
            
            if(min == sec_min)
            {
                if(v > min)
                    sec_min = v;
            }
            if(v > min && v < sec_min)
            {
                sec_min = v;
            }
            else if(v < min)
            {
                sec_min = min;
                min = v;
            }
            
            int w = findmin(root.right);
        
            if(w > min && w < sec_min)
            {
                sec_min = w;
            }
            else if(w < min)
            {
                sec_min = min;
                min = w;
            }
            if(min == sec_min)
            {
                if(w > min)
                    sec_min = w;
            }
            return sec_min;
        }
    }
}
