class Solution {
    public int[] transformArray(int[] nums) {
        int[] arr = new int[nums.length];
        int j = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                arr[j] = 0;
                j++;
            }
            
        }
        if(j != nums.length){
            for(;j<nums.length; j++)
                arr[j] = 1;
        }
        return arr;
    }
}