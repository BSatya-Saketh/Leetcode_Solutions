class Solution {
    public int rob(int[] nums){
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);

        return helper(nums, dp, 0);
    }

    public int helper(int[] nums, int[] dp, int i){
        if(i >= nums.length){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int rob = nums[i] + helper(nums, dp, i+2);
        int skip = helper(nums, dp, i+1);

        dp[i] = Math.max(rob, skip);
        return dp[i];
    }
}

// class Solution {
//     public int rob(int[] nums) {
//         return helper(nums, 0);
//     }

//     public int helper(int[] nums, int i) {

//         if (i >= nums.length) {
//             return 0;
//         }

//         int rob = nums[i] + helper(nums, i + 2);
//         int skip = helper(nums, i + 1);

//         return Math.max(rob, skip);
//     }
// }