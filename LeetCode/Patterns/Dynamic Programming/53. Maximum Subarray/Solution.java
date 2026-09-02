class Solution {
    public int maxSubArray(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }

        // int max = Integer.MIN_VALUE;
        // int curr = 0;

        // for(int i = 0; i<nums.length; i++){
        //     for(int j = i; j<nums.length; j++){
        //         curr = 0;
                
        //         for(int k = i; k<=j; k++){
        //             curr += nums[k];
        //         }

        //         if(max < curr){
        //             max = curr;
        //         }
        //     }
        // }

        // int max = nums[0]; 
        // int curr = 0;

        // for(int i = 0; i < nums.length; i++){
        //     curr += nums[i];
            
        //     if(max < curr){
        //         max = curr;
        //     }
            
        //     if(curr < 0){
        //         curr = 0;
        //     }
        // }
        
        // return max;

        int max = nums[0];
        int curr = nums[0];
 
        for(int i = 1; i < nums.length; i++){
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(max, curr);
        }
        return max;
    }
}