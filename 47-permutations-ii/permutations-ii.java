class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);

        boolean[] used = new boolean[nums.length];

        solve(nums, new ArrayList<>(), used);

        return ans;
    }

    void solve(int[] nums, List<Integer> list, boolean[] used) {

        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i]) {
                continue;
            }

            // Skip duplicate choices at the same level
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            // choose
            used[i] = true;
            list.add(nums[i]);

            // explore
            solve(nums, list, used);

            // backtrack
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
}