// Longest contiguous subarray

class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int max_curr=nums[0], max_sum=nums[0];
        int start=0, end=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] > (max_curr+nums[i]))
            {
                max_curr = nums[i];
                start = i;
            }
            else
            {
                if((max_curr + nums[i]) > max_curr && (max_curr + nums[i])>max_sum)
                    end = i;
                max_curr = max_curr + nums[i];
            }
            max_sum = Math.max(max_curr, max_sum);
        }
        return max_sum;
    }
}


