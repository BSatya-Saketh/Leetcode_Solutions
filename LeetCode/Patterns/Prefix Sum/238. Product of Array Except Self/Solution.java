// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int zerocnt = 0;
    
//         int prod = 1;
//         int prod2 = 1;
//         for(int i = 0; i<nums.length; i++){
//             if(nums[i] != 0)
//                 prod *= nums[i];
//             prod2 *= nums[i];

//             if(nums[i] == 0){
//                 zerocnt++;
//             }
//         }

//         if(zerocnt > 1){
//             for(int i = 0; i<nums.length; i++){
//                 nums[i] = 0;
//             }

//             return nums;
//         }

//         int[] res = new int[nums.length];

//         for(int i = 0; i<nums.length; i++){
//             if(nums[i] == 0){
//                 res[i] = prod;
//                 continue;
//             }
//             res[i] = prod2/nums[i];
//         }
//         return res;
//     }
// }
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        res[0] = 1;

        // Left products
        for(int i = 1; i < n; i++){
            res[i] = res[i - 1] * nums[i - 1];
        }

        int right = 1;

        // Multiply with right products
        for(int i = n - 1; i >= 0; i--){
            res[i] = res[i] * right;
            right *= nums[i];
        }

        return res;
    }
}