class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for(int num : nums){
            elementSum += num;
            digitSum += (num > 9)? digitsum(num) : num; 
        }

        return Math.abs(elementSum - digitSum);
    }

    public int digitsum(int num){
        int sum = 0;
        while(num > 0){
            sum += (num%10);
            num /= 10;
        }

        return sum;
    }
}