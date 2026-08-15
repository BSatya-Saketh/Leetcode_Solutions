class Solution {
    public int singleNumber(int[] nums) {
        // int max = maxValue(nums);
        // int[] freq = new int[max + 1];

        // for (int num : nums)
        //     freq[num]++;

        // for (int num : nums)
        //     if (freq[num] == 1)
        //         return num;
        // return 1;

        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
    // public int maxValue(int[] nums){
    //     int l = Integer.MIN_VALUE;
    //     for(int i = 0; i<nums.length; i++){
    //         if(l < nums[i])
    //             l = nums[i];
    //     }

    //     return l;
    // }
}