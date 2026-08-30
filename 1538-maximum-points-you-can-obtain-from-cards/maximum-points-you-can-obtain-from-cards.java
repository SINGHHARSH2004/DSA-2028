class Solution {
    public int maxScore(int[] nums, int k) {
        int n=nums.length-1;
        int r=k-1;
        int sum=0;
        for(int i=0;i<=r;i++){
            sum=sum+nums[i];
        }
        int max=sum;
        while(r>=0){
            sum=sum-nums[r];
            r--;
            sum=sum+nums[n];
            n--;
            max=Math.max(max,sum);
        }
        return max;
    }
}