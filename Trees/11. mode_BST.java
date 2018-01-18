Code: Not a good solution as it uses hash map, integer array and arraylist
Method 1: Use a hash map, maintain tree elements and count of all elements. Finally iterate though the hash map and get elements with higher count and return mode.
Method 2: Inorder traversal of tree. Finally iterate though the hash map and get elements with higher count and return mode. maintain integer array with elements with max count.

class Solution 
{   
    int max_count = 0;
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    public int[] findMode(TreeNode root) 
    {
        int MAX = 0, index = 0;
        List<Integer> list = new ArrayList<Integer>();
            
        inorder(root);
        
        Set s = hm.entrySet();
        Iterator itr = s.iterator();
        while(itr.hasNext())                            // Iteration 1 : find the max value in the hashmap
        {
            Map.Entry me = (Map.Entry)itr.next();
            int key = (int)me.getKey();
            int value = (int)me.getValue();
            if(value > max_count)
            {
                max_count = value;
            }
        }
       
        Set s1 = hm.entrySet();
        Iterator itr1 = s1.iterator();
        while(itr1.hasNext())                     // Iteration 2 : retrieve key with maximum value from the hash map
        {
            Map.Entry me = (Map.Entry)itr1.next();
            int key1 = (int)me.getKey();
            int value1 = (int)me.getValue();
            if(value1 == max_count)
            {
                MAX++;
                list.add(key1);
                index++;
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i] = list.get(i);
        }
        return arr;
    }
    public void check_mode(int val)
    {
        if(hm.containsKey(val))
        {
            hm.put(val, (int)hm.get(val)+1);
        }
        else
        {
            hm.put(val, 1);
        }
    }
    public void inorder(TreeNode root)
    {
        if(root != null)
        {
            inorder(root.left);
            check_mode(root.val);
            inorder(root.right);
        }
        else
            return;
    }
}
