class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int Largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] > Largest){
                SecondLargest = Largest;
                Largest = nums[i];
            }
            else if(nums[i] > SecondLargest)
                SecondLargest = nums[i];
            if(nums[i] < Smallest)
                Smallest = nums[i];
        }

        return Largest + SecondLargest - Smallest;
    }
}