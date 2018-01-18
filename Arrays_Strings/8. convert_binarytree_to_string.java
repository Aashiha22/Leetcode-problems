/* Convert binary tree to string:

Linkedhashmap  maintains the insertion order
HashMap  Does not maintain the insertion order
TreeMap sorts the entries automatically when they are inserted.

If 1 string is contained in other, how to check it?
Ans: string1.contains(characterseq)  Both string 1 should be in string format. characterseq should be in character sequence format and not a single character.

So to check a single character do this  string1.contains(Character.toString(char_c))  returns true or false
*/

class Solution 
{
    StringBuilder sb = new StringBuilder();
    public String tree2str(TreeNode t) 
    {
        construct(t);    
        return new String(sb);
    }
    public void construct(TreeNode root)
    {
        if(root == null)
            return;
        else
        {
            sb.append(Integer.toString(root.val));
            if((root.left != null) || (root.right != null)) 
                sb.append('(');
            construct(root.left);
            if((root.left != null) || (root.right != null)) 
                sb.append(')');
            if(root.right != null)
                sb.append('(');
            construct(root.right);
            if(root.right != null)
                sb.append(')');
        }
    }
}
