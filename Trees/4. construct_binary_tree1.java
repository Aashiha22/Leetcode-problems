// Construct binary tree from inorder and preorder traversals

// Inorder: left, root, right
// Preorder: root, left, right

class Solution 
{
    int pre_index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) 
    {
          return construct_tree(preorder, inorder, 0, inorder.length-1);
    }
    public TreeNode construct_tree(int[] preorder, int[] inorder, int start, int end)
    {
        if(start>end)
            return null;
        else
        {
            int in_index = 0;
            for(int i=0;i<=inorder.length-1;i++)
            {
                if(inorder[i] == preorder[pre_index])
                {
                    in_index = i;
                }
            }
            pre_index++;
            TreeNode root = new TreeNode(inorder[in_index]);
            root.left = construct_tree(preorder, inorder, start, in_index-1);
            root.right = construct_tree(preorder, inorder, in_index+1, end);
            return root;
        }
    }
}
