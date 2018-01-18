/* Convert BST to greater tree:

Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.
Example:
Input: The root of a Binary Search Tree like this:
              5
            /   \
           2     13

Output: The root of a Greater Tree like this:
             18
            /   \
          20     13
          

Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Method 1:
Maintain t and l for each node. l is max of length of left nodes and right nodes plus 1. t value is the sum of length left nodes and right nodes. max_t will hold the maximum t till now and its value will be returned.

Code:
*/

class Solution 
{
    int max_t = 0;
    public int diameterOfBinaryTree(TreeNode root) 
    {
        len_node(root);    
        return max_t;
    }
    
    public int len_node(TreeNode root)
    {
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 0;
        int t = 0;
        if(root.left == null || root.right == null)
            t = len_node(root.left) + len_node(root.right) + 1;
        else
            t = len_node(root.left) + len_node(root.right) + 2;
        max_t = (max_t < t) ? t : max_t;
        int l1 = (len_node(root.left) > len_node(root.right)) ? len_node(root.left) : len_node(root.right);
        int l = l1 + 1;
        return l;
    }
}


