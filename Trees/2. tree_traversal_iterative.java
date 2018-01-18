// Inorder, preorder traversal - iterative

//a. inorder
class Solution 
{
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        TreeNode curr = root;
        List<Integer> ls = new ArrayList<Integer>();
        Stack<TreeNode> st =  new Stack<TreeNode>();
        while(curr != null || st.isEmpty() != true)
        {
            while(curr!=null)
            {
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            ls.add(curr.val);
            curr = curr.right;
        }
        return ls;
    }
}

//b. preorder
class Solution 
{
    public List<Integer> preorderTraversal(TreeNode root) 
    {
        TreeNode curr = root;
        Stack<TreeNode> st = new Stack<TreeNode>();
        List<Integer> ls = new ArrayList<Integer>();
        while(curr != null || st.isEmpty()!=true)
        {
            if(curr != null)
            {
                ls.add(curr.val);
                st.push(curr.right);
                st.push(curr.left);
            }
            curr = st.pop();
        }
        return ls;
    }
}

