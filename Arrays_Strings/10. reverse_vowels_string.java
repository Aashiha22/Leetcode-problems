// Reverse vowels of a string 

// Method 1 – string 2 iterations

// Have a stack, put all vowels in stack. Iterate again and replace all values by popping from stack.

class Solution 
{
    public String reverseVowels(String s) 
    {
        Stack<Character> st = new Stack<Character>();
        char[] arr = s.toCharArray();
        String s1 = "aeiouAEIOU";
        for(int i=0;i<arr.length;i++)
        {
            if(s1.contains(Character.toString(arr[i])))
            {
                st.push(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(s1.contains(Character.toString(arr[i])))
            {
                arr[i] = st.pop();
            }
        }
        return new String(arr);
    }
}
