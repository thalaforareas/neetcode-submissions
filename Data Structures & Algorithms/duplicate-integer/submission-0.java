
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> a= new HashSet<Integer>();

        for(int i=0;i<nums.length;i++)
        {
            if(a.contains(nums[i]))
            {
                return true;

            }
            else
            {
                a.add(nums[i]);
            }
        }
        return false;
        
    }
}