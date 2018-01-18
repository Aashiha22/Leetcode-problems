//Convert BST to Linked list 
//Preorder format in-place in tree (iterative): [using DFS concept – stack]

class Solution 
{
    public void flatten(TreeNode root) 
    {
        Stack<TreeNode> st = new Stack<TreeNode>();
        if(root == null)
            return;
        st.push(root);
        
        while(st.isEmpty() != true)
        {
            TreeNode node = st.pop();
            if(node.right != null)
                st.push(node.right);
            if(node.left != null)
                st.push(node.left);
            node.left = null;
            if(st.isEmpty() != true)
                node.right = st.peek();
        }
    }
}
