//Inorder, preorder, postorder (recursive)

// a.	Preorder traversal
class Solution 
{
    public List<Integer> preorderTraversal(TreeNode root) 
    {
        List<Integer> list = new ArrayList<Integer>();
        list = preorder(list,root);
        return list;
    }
    
    public List<Integer> preorder(List<Integer> list, TreeNode node)
    {
        if(node == null)
            return list;
        else
        {
            list.add(node.val);
            preorder(list, node.left);
            preorder(list, node.right);
        }
        return list;
    }
}

// b.	Inorder traversal

class Solution 
{
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        List<Integer> list = new ArrayList<Integer>();
        list = inorder(root, list);
        return list;
    }
    public List<Integer> inorder(TreeNode node, List<Integer> list)
    {
        if(node == null)
            return list;
        else
        {
            inorder(node.left, list);
            list.add(node.val);
            inorder(node.right, list);
        }
        return list;
    }
}

// c.	Postorder traversal:

class Solution 
{
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        List<Integer> list = new ArrayList<Integer>();    
        list = postorder(root, list);
        return list;
    }
    
    public List<Integer> postorder(TreeNode curr, List<Integer> list)
    {
        if(curr == null)
            return list;
        else
        {
            list = postorder(curr.left, list);
            list = postorder(curr.right, list);
            list.add(curr.val);
        }
        return list;
    }
}
