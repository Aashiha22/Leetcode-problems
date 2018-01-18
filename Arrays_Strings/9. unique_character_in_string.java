// First unique character in the string:

//Method 2 O(n) 2 iterations
class Solution 
{
    public int firstUniqChar(String s) 
    {
        if(s.length() == 0)
            return -1;
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        char[] s_arr = s.toCharArray();
        for(int i=0;i<s_arr.length;i++)
        {
            if(hm.containsKey(s_arr[i]) == true)
                hm.put(s_arr[i], hm.get(s_arr[i]) + 1);
            else
            {
                hm.put(s_arr[i], 1);
            }
        }
        for(int i=0;i<s_arr.length;i++)
        {
            if(hm.get(s_arr[i]) == 1)
                return i;
        }
        return -1;
    }
}
