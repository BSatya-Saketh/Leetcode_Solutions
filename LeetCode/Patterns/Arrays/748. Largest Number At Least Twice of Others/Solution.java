class Solution {
    public int dominantIndex(int[] nums) {
        int large = Integer.MIN_VALUE;
        int idx = -1;
        for(int i = 0; i<nums.length; i++){
            if(large < nums[i]){
                large = nums[i];
                idx = i;
            }
        }

        for(int i = 0; i<nums.length; i++)
            if(nums[i]*2 > large && i != idx)
                return -1;

        return idx; 
    }
}