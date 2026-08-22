class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int largest = large(nums);
        int smallest = small(nums);

        if(smallest+k >= largest-k)
            return 0;
        
        return (largest-k) - (smallest+k);
    }

    public int large(int[] nums){
        int large = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] > large)
                large = nums[i];
        }

        return large;
    }

    public int small(int[] nums){
        int small = Integer.MAX_VALUE;
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i] < small){
                small = nums[i];
            }
        }

        return small;
    }
}