class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    void solve(int start, int[] candidates, int target,
               ArrayList<Integer> list) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            if (candidates[i] > target)
                continue;

            list.add(candidates[i]);

            
            solve(i, candidates, target - candidates[i], list);

            
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(0, candidates, target, new ArrayList<>());
        return ans;
    }
}