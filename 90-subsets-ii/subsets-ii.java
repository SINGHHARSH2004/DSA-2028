class Solution {
    HashSet<List<Integer>> set = new HashSet<>();

    void solve(int[] nums, int i, ArrayList<Integer> list) {

        if (i == nums.length) {
            set.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        solve(nums, i + 1, list);
        list.remove(list.size() - 1);
        solve(nums, i + 1, list);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
            Arrays.sort(nums);
        solve(nums, 0, list);

        return new ArrayList<>(set);
    }
}