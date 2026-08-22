class Solution {
    public int maximumProduct(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int n: nums){
            if(n > first){
                third = second;
                second = first;
                first = n;
            }
            else if(n > second){
                third = second;
                second = n;
            }
            else if(n > third)
                third = n;

            if(n < min1){
                min2 = min1;
                min1 = n;
            }
            else if (n < min2)
                min2 = n;
        }

        return Math.max(first*second*third, first*min1*min2);
    }
}