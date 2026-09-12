class Solution {

    public void findSubsets(List<List<Integer>> res, int[] nums, int i, List<Integer> list){
        if(i == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        findSubsets(res, nums, i+1, list);
        list.remove(list.size()-1);
        findSubsets(res, nums, i+1, list);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        findSubsets(res, nums, 0, new ArrayList<>());
        return res;
    }
}