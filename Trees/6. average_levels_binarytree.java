// Average of level values in binary tree

class Solution 
{
    TreeMap hm = new TreeMap();
    public List<Double> averageOfLevels(TreeNode root) 
    {
        average(root, 0);
        List<Double> ls = new ArrayList<Double>();
        Set s = hm.entrySet();
        Iterator itr = s.iterator();
        while(itr.hasNext())
        {
            Map.Entry me = (Map.Entry)itr.next();
            List<Integer> ls1 = (List<Integer>)me.getValue();
            int index = (int)me.getKey();
            int sum=ls1.get(0);
            int flag = 0;
            for(int i=1;i<ls1.size();i++)
            {
                if(sum >= Integer.MAX_VALUE)
                {
                    System.out.println("Entered here");
                    sum = Integer.MAX_VALUE;
                    System.out.println("Final sum "+sum );
                    flag = 1;
                    break;
                }
                else
                {
                    sum = sum + ls1.get(i);
                }
            }
            double avg;
            if(flag == 1)
                avg = sum;
            else
                avg = ((double)sum / (double)ls1.size());
            ls.add(avg);
        }
        return ls;
    }
    
    public void average(TreeNode root,  int level)
    {
        if(root == null)
            return;
        else
        {
            if(hm.containsKey(level))
            {
                List<Integer> ls1 = (List<Integer>)hm.get(level);
                ls1.add(root.val);
                hm.put(level, ls1);
            }
            else
            {
                List<Integer> ls1 = new ArrayList<Integer>();
                ls1.add(root.val);
                hm.put(level, ls1);
                System.out.println(root.val);
            }
            average(root.left, level+1);
            average(root.right,level+1);
        }
    }
}
