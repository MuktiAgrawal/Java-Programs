public class CombinationSumI {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> small = new ArrayList<>();
        helper(candidates, result, small, target, 0);
        return result;
    }

    public void helper(int candidates[], List<List<Integer>> result, List<Integer> small, int target, int index) {
        if (target == 0) {
            result.add(new ArrayList<>(small));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (target >= candidates[i]) {
                small.add(candidates[i]);
                helper(candidates, result, small, target - candidates[i], i);
                small.remove(small.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> small=new ArrayList<>();
        helper(candidates,result,small,target,0);
        return result;
    }
    public void helper2(int candidates[],List<List<Integer>> result,List<Integer> small, int target,int i){
        if(i==candidates.length){
            if(target==0){
                result.add(new ArrayList<>(small));
            }
            return;
        }
        if(target>=candidates[i]){
            small.add(candidates[i]);
            helper(candidates,result,small,target-candidates[i],i);
            small.remove(small.size()-1);
        }
        helper(candidates, result,small, target,i+1);
    }
}
