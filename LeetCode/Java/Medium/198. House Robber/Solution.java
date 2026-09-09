class Solution {
    public int rob(int[] nums) {
        return helper(nums, 0);
    }

    public int helper(int[] nums, int i){
        if(i >= nums.length){
            return 0;
        }

        int rob = nums[i] + helper(nums, i+2);
        int skip = helper(nums, i+1);

        return Math.max(rob, skip);
    }
}