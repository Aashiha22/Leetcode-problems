/* Longest substring without repeating characters

Given a string, find the length of the longest substring without repeating characters.
Examples:
Given "abcabcbb", the answer is "abc", which the length is 3.
Given "bbbbb", the answer is "b", with the length of 1.
Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
Code:
*/
//My solution - Sliding window Hash map concept O(N) -> more optimized
class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        char[] arr = s.toCharArray();
        int ans=0;
        for(int i=0,j=0;j<arr.length;j++)
        {
            if(hm.containsKey(arr[j]))
            {
                i = Math.max(hm.get(arr[j]),i);
            }
            ans = Math.max(ans, j-i+1);
            hm.put(arr[j], j+1);
        }
        return ans;
    }
}
