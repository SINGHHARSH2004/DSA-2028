class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int start = -1;
        int end = -1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                start = i;
                break;
            }
        }

        if (start == -1) {
            return 0;
        }

        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] < nums[i - 1]) {
                end = i;
                break;
            }
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = start; i <= end; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        while (start > 0 && nums[start - 1] > min) {
            start--;
        }

        while (end < nums.length - 1 && nums[end + 1] < max) {
            end++;
        }

        return end - start + 1;
    }
}