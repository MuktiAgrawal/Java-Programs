public class SubsetII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        int end = 0;
        for (int j = 0; j < nums.length; j++) {
            int start = 0;
            int n = res.size();
            if (j > 0 && nums[j] == nums[j - 1]) {
                start = end;
            }
            end = res.size();
            for (int i = start; i < n; i++) {
                List<Integer> small = new ArrayList<>(res.get(i));
                small.add(nums[j]);
                res.add(small);
            }
        }
        return res;
    }
}
