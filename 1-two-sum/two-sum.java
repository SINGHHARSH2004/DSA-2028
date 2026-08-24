class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] arr1 = nums.clone();

        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int sum = nums[left] + nums[right];

            if (sum < target) {
                left++;
            } 
            else if (sum > target) {
                right--;
            } 
            else {

                int[] ans = new int[2];

                for (int i = 0; i < arr1.length; i++) {

                    if (arr1[i] == nums[left]) {
                        ans[0] = i;
                        break;
                    }
                }

                for (int i = 0; i < arr1.length; i++) {

                    if (arr1[i] == nums[right] && i != ans[0]) {
                        ans[1] = i;
                        break;
                    }
                }

                return ans;
            }
        }

        return new int[]{};
    }
}