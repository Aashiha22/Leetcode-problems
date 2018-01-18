/* Find pivot index

Given an array of integers nums, write a method that returns the "pivot" index of this array.
We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.
If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
Example 1:
Input: 
nums = [1, 7, 3, 6, 5, 6]
Output: 3
Explanation: 
The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
Also, 3 is the first index where this occurs.
Example 2:
Input: 
nums = [1, 2, 3]
Output: -1
Explanation: 
There is no index that satisfies the conditions in the problem statement.
*/

// Method 1: Single iteration but will not work for negative integers

class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        if(nums.length == 0)
            return -1;
        int sum1 = nums[0], sum2 = nums[nums.length-1];
        int i = 1, j = nums.length-2;
        while(i<j)
        {
            if(sum1 > sum2)
            {
                sum2 = sum2 + nums[j];
                j--;
            }
            else if(sum2 > sum1)
            {
                sum1 = sum1 + nums[i];
                i++;
            }
            if(sum1 == sum2)
            {
                if(i==j)
                    return i;
                else
                {
                    sum1 = sum1 + nums[i++];
                    sum2 = sum2 + nums[j--];
                }
            }
        }
        return -1;
    }
}

Method 2: 2 iterations, first  get the sum of all numbers, second  remove element one by one maintain removed elements sum and check if that sum is equal to this and return the index

Code:
class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        int sum = 0, sum1=0;
        for(int i=0;i<nums.length;i++)
        {
            sum = sum + nums[i];
        }
        for(int i=0,j=nums.length-1;i<nums.length;i++)
        {
            sum = sum - nums[i];
            if(sum1 == sum)
                return i;
            sum1 = sum1 + nums[i];
        }
        return -1;
    }
}
