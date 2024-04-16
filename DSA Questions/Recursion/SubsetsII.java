public class SubsetsII {
    // Brute Force
    // Run for all subsets, just use a hashset that will discard duplicate subsets
    // hashset<String>

    // Optimal approach
    // At nth recursive call, make subset of nth length
    // for first branch, take the element,
    // for other branches check for duplicacy of element
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> small = new ArrayList<>();
        helper(res, small, 0, nums);
        return res;
    }

    public void helper(List<List<Integer>> res, List<Integer> small, int index, int nums[]) {

        res.add(new ArrayList<>(small));
        for (int i = index; i < nums.length; i++) {
            if (i != index && nums[i] == nums[i - 1]) {
                continue;
            } else {
                small.add(nums[i]);
                helper(res, small, i + 1, nums);
                small.remove(small.size() - 1);
            }
        }
    }
}
