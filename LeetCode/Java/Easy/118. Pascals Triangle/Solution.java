class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        if (numRows == 0) return res;

        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        res.add(prev);

        for (int row = 2; row <= numRows; row++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);

            for (int i = 0; i < prev.size() - 1; i++) {
                curr.add(prev.get(i) + prev.get(i + 1));
            }

            curr.add(1);
            res.add(curr);
            prev = curr;
        }

        return res;
    }
}