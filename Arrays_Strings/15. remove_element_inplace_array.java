/* Remove Element:

Given an array and a value, remove all instances of that value in-place and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
The order of elements can be changed. It doesn't matter what you leave beyond the new length.
Example:
Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2.

Method 1:
2 pointers – same as above problem. i ptr holds index of unique elements and j ptr iterates through entire array checking all array elements.

Code:

*/ 

class Solution 
{
    public int removeElement(int[] nums, int val) 
    {
        int i=0, j=0;
        if(nums.length == 0)
            return 0;
        while(j<nums.length)
        {
            while(j<nums.length && nums[j] == val)
                j++;
            if(j<nums.length)
                nums[i++] = nums[j++];
        }
        return i;
    }
}
