class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int val=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[k]=nums[i];
                val=nums[i];
                k++;
            }

        }
        return k;
    }
}