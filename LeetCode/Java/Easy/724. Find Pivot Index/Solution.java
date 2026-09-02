class Solution {
    // public int pivotIndex(int[] nums) {
    //     int leftSum = 0;
    //     int totalSum = 0;

    //     for(int num : nums)
    //         totalSum += num;

    //     for(int i = 0; i< nums.length; i++){
    //         if(leftSum == (totalSum - leftSum - nums[i]))   
    //             return i;
            
    //         leftSum += nums[i];
    //     }

    //     return -1;
    // }

    // public int sumOfLeft(int[] nums, int i){
    //     int sum = 0;
    //     for(int k = i; k >= 0; k--){
    //         sum += nums[k];
    //     }

    //     return sum;
    // }

    // public int sumOfRight(int[] nums, int i){
    //     int sum = 0;
    //     for(int k = i; k<nums.length; k++){
    //         sum += nums[k];
    //     }

    //     return sum;
    // }

    public int pivotIndex(int[] nums){
        int n = nums.length;
        if (n == 0) return -1;

        int[] pref = new int[n];
        int[] suff = new int[n];

        pref[0] = nums[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + nums[i];
        }

        suff[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            if (pref[i] == suff[i]) {
                return i;
            }
        }

        return -1;
    }
}