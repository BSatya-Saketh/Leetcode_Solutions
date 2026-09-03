class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n);     
        reverse(nums, 0, k);    
        reverse(nums, k, n);    
    }

    static void reverse(int[] nums, int l, int r) {
        int low = l, high = r - 1;

        while (low < high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            
            low++;
            high--;
        }
    }
}
