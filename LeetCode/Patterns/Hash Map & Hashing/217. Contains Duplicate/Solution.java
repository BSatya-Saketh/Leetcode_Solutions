class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Set<Integer> seen = new HashSet<>();

        // for(int num:nums){
        //     if(seen.contains(num))
        //         return true;
        //     else
        //         seen.add(num);
        // }
        // return false;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            if(map.containsKey(num)){
                return true;
            }

            map.put(num, 1);
        }

        return false;
    }
}