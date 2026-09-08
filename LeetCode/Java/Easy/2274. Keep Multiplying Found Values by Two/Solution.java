class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        while(true){
            int temp = original;

            for(int i = 0; i< nums.length; i++){
                if(nums[i] == original){
                    original *= 2;
                    break;
                }
            }

            if(temp == original)
                break;
        }

        return original;
    }
}