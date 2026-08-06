class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int len = 0;
        int max = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 1) {
                len++;
                max = Math.max(max, len);
            } else {
                len = 0;
            }
        }

        return max;
    }
}