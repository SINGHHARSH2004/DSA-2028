class Solution {
    ArrayList<List<Integer>> ans = new ArrayList<>();

    void solve(int[] nums, int idx, int target, ArrayList<Integer> list) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) {
                continue;
            }
            list.add(nums[i]);
            solve(nums, i + 1, target - nums[i], list);
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);

        ArrayList<Integer> list = new ArrayList<>();
        solve(nums, 0, target, list);

        return ans;
    }
}