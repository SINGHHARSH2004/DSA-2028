class Solution {
    public int[] asteroidCollision(int[] nums) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums.length; i++) {

            int curr = nums[i];

            // Collision possible
            while (!stack.isEmpty() && stack.peek() > 0 && curr < 0) {

                int top = stack.peek();
                if (Math.abs(top) > Math.abs(curr)) {
                    curr = 0;
                    break;
                }
                else if (Math.abs(top) == Math.abs(curr)) {
                    stack.pop();
                    curr = 0;
                    break;
                }
                else {
                    stack.pop();
                }
            }
            if (curr != 0) {
                stack.push(curr);
            }
        }
        int[] ans = new int[stack.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }
}