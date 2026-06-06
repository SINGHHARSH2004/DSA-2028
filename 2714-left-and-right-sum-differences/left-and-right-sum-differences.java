class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] result=new int[nums.length];
        int[] leftSum=new int[nums.length];
        int[] rightSum= new int[nums.length];
       
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i-1;j>=0;j--){
                sum=sum+nums[j];
            }
            leftSum[i]=sum;
        }

        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i+1;j<nums.length;j++){
                sum=sum+nums[j];
            }
            rightSum[i]=sum;
        }
        for(int i = 0; i < nums.length; i++) {
            result[i] = Math.abs(leftSum[i]-rightSum[i]);
        }
        return result;
    }
}