class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();

        int count1 = 0, count2 = 0;
        Integer cand1 = null, cand2 = null;

        for (int num : nums) {
            if (cand1 != null && num == cand1) {
                count1++;
            } else if (cand2 != null && num == cand2) {
                count2++;
            } else if (count1 == 0) {
                cand1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                cand2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        List<Integer> res = new ArrayList<>();
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == cand1) count1++;
            else if (num == cand2) count2++;
        }

        if (count1 > nums.length / 3) res.add(cand1);
        if (count2 > nums.length / 3) res.add(cand2);

        return res;
    }
}
