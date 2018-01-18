// Construct binary tree from inorder and postorder traversals:

class Solution 
{
    int post_index=0;
    public TreeNode buildTree(int[] inorder, int[] postorder) 
    {
        post_index = postorder.length - 1;
        return construct(inorder, postorder, 0, inorder.length-1);
    }
    
    public TreeNode construct(int[] inorder, int[] postorder, int start, int end)
    {
        if(start>end)
            return null;
        else
        {
            int in_index = 0;
            TreeNode root = new TreeNode(postorder[post_index]);
            for(int i=0;i<inorder.length;i++)
            {
                if(inorder[i] == postorder[post_index])
                    in_index = i;
            }
            post_index--;
            
            root.right = construct(inorder, postorder, in_index+1, end);
            root.left = construct(inorder, postorder, start, in_index-1);
            return root;
        }
    }
}
