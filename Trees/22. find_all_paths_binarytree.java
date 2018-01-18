/* Binary tree paths

Given a binary tree, return all root-to-leaf paths.
For example, given the following binary tree:
   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:
["1->2->5", "1->3"]
Code:  */

class Solution 
{
    public List<String> binaryTreePaths(TreeNode root) 
    {
        List<String> str_list = new ArrayList<String>();
        if(root == null)
            return str_list;
        get_path(root, "", str_list);
        return str_list;
    }

    public void get_path(TreeNode root, String val, List<String> list)
    {
        if(root.right == null && root.left == null)
        {
            val = val + root.val;
            list.add(val);
        }
        val = val + root.val +"->";
        if(root.left != null)
        {
            get_path(root.left, val, list);
        }
        if(root.right != null)
        {
            get_path(root.right, val, list);
        }
    }
}
