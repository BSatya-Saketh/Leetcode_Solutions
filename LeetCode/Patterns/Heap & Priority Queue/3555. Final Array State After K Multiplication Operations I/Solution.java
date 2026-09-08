// class Solution {
//     public int[] getFinalState(int[] nums, int k, int multiplier) {
//         for(int i = 0; i<k; i++){
//             int x = small(nums);
//             for(int j = 0; j<nums.length; j++){
//                 if(nums[j] == x){
//                     nums[j] = x*multiplier;
//                     break;
//                 }
//             }
//         }

//         return nums;
//     }

//     public int small(int[] nums){
//         int x = Integer.MAX_VALUE;
//         for(int i = 0; i<nums.length; i++){
//             if(x > nums[i])
//                 x = nums[i];
//         }

//         return x;
//     }
// }

class Solution{
    public int[] getFinalState(int[] nums, int k, int multiplier){
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int num : nums){
            q.add(num);
        }
        for(; k > 0; ){
            int small = q.poll();
            int multiple = small * multiplier;

            for(int j = 0; j < nums.length; j++){
                if(nums[j] == small){
                    nums[j] = multiple;
                    q.add(multiple);
                    break;
                }
            }

            k--;
        }

        return nums;
    }
}