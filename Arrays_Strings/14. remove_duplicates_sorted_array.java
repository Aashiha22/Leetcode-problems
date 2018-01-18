// Remove Duplicates from Sorted Array

Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
Example:
Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
It doesn't matter what you leave beyond the new length.
Method 1: [better]  IMPLEMENTED
Two pointers I and j. j iterates through the array and i keep tracks of index of unique entries in array(modified entries). Time complexity: O(n) Space complexity: O(1)

Code:

class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return 1;
        int i=0, j=1;
        int prev = nums[0];
        while(j < nums.length)
        {
            while(j<nums.length && nums[j] == prev)
            {
                j++;
            }
            nums[i] = prev;
            if(j<nums.length)
                prev = nums[j];
            i++;
        }
        return i;
    }
}

Method 2: 
Iterate through the array and store unique elements in hash set. Reiterate through the array and enter unique values in array. Time complexity: O(n) Space complexity: O(n) -> hash set used
