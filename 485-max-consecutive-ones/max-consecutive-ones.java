class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int start=0;
       int end=0;
       int n=nums.length-1; 
       int count=0;
       int max=0;
       while(end<=n){
        if(nums[end]==1){
            count++;
            end++;
        }
        else{
            max=Math.max(max,count);
            start=end+1;
                end++;
                count=0;
        }
       }
       return Math.max(max,count);
    }
}