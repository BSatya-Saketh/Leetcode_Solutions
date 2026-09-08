class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            }
            else if (nums[i] > secondLargest) {
                secondLargest = nums[i];
            }

            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }

        return largest + secondLargest - smallest;
    }
}