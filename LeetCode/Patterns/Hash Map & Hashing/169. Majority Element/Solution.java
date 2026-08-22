class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];

        // int cnt = 0;
        // int curr = nums[0];
        // for(int i = 0; i<nums.length; i++){
        //     if(cnt == 0)
        //         curr = nums[i];
        //     if(curr == nums[i])
        //         cnt++;
        //     else
        //         cnt--;
        // }
        // return curr;

        // HashMap<Integer, Integer> map = new HashMap<>();
        // int n = nums.length;

        // for (int num : nums) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);

        //     if (map.get(num) > n / 2) {
        //         return num;
        //     }
        // }
        // return -1;
    }
}