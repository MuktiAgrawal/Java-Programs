public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, res, new ArrayList<>(), 0);
        return res;
    }

    public void helper(int[] candidates, int target, List<List<Integer>> res, List<Integer> small, int ind) {
        if (target == 0) {
            res.add(new ArrayList<>(small));
            return;
        }
        for (int i = ind; i < candidates.length; i++) {
            if (i > ind && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (candidates[i] > target)
                break;

            small.add(candidates[i]);
            helper(candidates, target - candidates[i], res, small, i + 1);
            small.remove(small.size() - 1);
        }
    }
}
