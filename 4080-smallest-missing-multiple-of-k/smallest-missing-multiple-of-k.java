class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int num = k;
        while (set.contains(num)) {
            num+= k;
        }
        return num;
    }
}