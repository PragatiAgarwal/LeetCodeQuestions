class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int start = 0;
        int end = 0;
        int maxSumSoFar = nums[0];
        for(int i = 1; i<nums.length; i++){
             
            maxSumSoFar = Math.max(maxSumSoFar + nums[i], nums[i]);
            sum = Math.max(sum, maxSumSoFar);
        }
        return sum;
        
    }
}