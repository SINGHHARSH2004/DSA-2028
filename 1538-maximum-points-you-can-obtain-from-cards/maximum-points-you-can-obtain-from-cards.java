class Solution {
    public int maxScore(int[] nums, int k) {
        int l = 0;
        int r = k - 1;
        int a = nums.length - 1;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;

        while (r >= 0) {
            sum -= nums[r];
            r--;
            sum += nums[a];
            a--;

            max = Math.max(max, sum);
        }

        return max;
    }
}