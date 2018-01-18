/* Check if a valid palindrome

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
Code:
Method 1: 2 pointers ignore alpha numeric characters and check if left and right pointer character values are same or not.

****To check if a character is a letter or digit  
Character.isLetter(char_c)  is letter a-z A-Z
Character.isDigit(char_c) is number 0-9
Character.isLetterOrDigit(char_c)  check both letter or number (check alphanumeric)

The argument into these functions is a character. */

 class Solution 
{
    public boolean isPalindrome(String s) 
    {
        char[] arr = s.toCharArray();
        String s1 = "aeiouAEIOU";
        int i=0, j=arr.length-1;
        while(i<=j && i<arr.length && j>=0)
        {
            if((Character.isLetterOrDigit(arr[i])) && (Character.isLetterOrDigit(arr[j])))
            {
                if(Character.toLowerCase(arr[i]) == Character.toLowerCase(arr[j]))
                {
                    i++;
                    j--;
                }
                else
                    return false;
            }
            else if(!Character.isLetterOrDigit(arr[i]))
            {
                i++;
            }
            else if(!Character.isLetterOrDigit(arr[j]))
            {
                j--;
            }
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
}
