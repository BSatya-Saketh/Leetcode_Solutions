class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // int cnt = 0;
        // Hash<Integer, Integer> map = new Hash<>();
        // int currSum = 0;

        // map.put(currSum, map.getOrDefault(currSum, 0)+1);

        // for(int num : nums){
        //     currSum += num;

        //     if(curr%k == 0){
        //         cnt
        //     }
        // }

        int cnt = 0;

        for(int start = 0; start < nums.length; start++){
            for(int end = start; end < nums.length; end++){
                int sum = 0;
                for(int i = start; i <= end; i++){
                    sum += nums[i];
                }

                if(sum % k == 0){
                    cnt++;
                }
            }
        }

        return cnt;
    }
}