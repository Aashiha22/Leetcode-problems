// Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.

class Solution 
{
    public boolean findTarget(TreeNode root, int k) 
    {
        if(root == null)
            return false;
        else
        {
            HashSet<Integer> hs = new HashSet<Integer>();
            return check_sum(root, k, hs);
        }
    }
    public boolean check_sum(TreeNode root, int sum, HashSet<Integer> hs)
    {
        if(root == null)
            return false;
        else
        {
            if(hs.contains(sum-root.val))
                return true;
            else
            {
                hs.add(root.val);
            }
            return check_sum(root.left,sum,hs)||check_sum(root.right,sum,hs);
        }
    }
}

//Complexity Analysis
•	Time complexity : O(n). The entire tree is traversed only once in the worst case. Here, n refers to the number of nodes in the given tree.
•	Space complexity : O(n). The size of the set can grow upto n in the worst case.
