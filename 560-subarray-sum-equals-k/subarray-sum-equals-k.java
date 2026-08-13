class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int totalSum = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];

            int diff = totalSum - k;

            if (map.containsKey(diff)) {
                result += map.get(diff);
            }

            map.put(totalSum, map.getOrDefault(totalSum, 0) + 1);
        }

        return result;
    }
}