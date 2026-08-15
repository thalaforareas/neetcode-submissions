class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        
        // 1. Left Pass: Calculate the product of all elements to the left
        res[0] = 1; // Nothing to the left of the first element
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        
        // 2. Right Pass: Calculate the product of elements to the right 
        // and multiply it with the left product on the fly
        int rightProduct = 1; 
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * rightProduct;
            rightProduct *= nums[i];
        }
        
        return res;
    }
}