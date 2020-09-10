class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        for(int i=1;i<nums.length;i++)
            if(nums[i]>=nums[max])
                max = i;
        
        for(int i=0;i<nums.length;i++)
        {
            if(i!=max)
            {
                if(nums[i]*2 <= nums[max])
                    continue;
                else
                    return -1;
            }
        }
        return max;
    }
}