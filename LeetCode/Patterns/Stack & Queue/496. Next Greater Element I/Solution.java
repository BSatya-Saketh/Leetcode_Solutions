class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int large;
        for(int i = 0; i<nums1.length; i++){

            for(int j = 0; j<nums2.length; j++){

                if(nums1[i] == nums2[j] && (j+1) < nums2.length){
                    nums1[i] = greater(nums2, j+1, nums2[j]);
                    break;
                }

                if(nums1[i] == nums2[j] && (j+1) == nums2.length){
                    nums1[i] = -1;
                    break;
                }
            }
        }
        return nums1;
    }

    public int greater(int[] nums, int n, int x){

        for(int i=n; i<nums.length; i++){
            if(nums[i] > x){
                return nums[i];
            }
        }

        return -1;
    }
}