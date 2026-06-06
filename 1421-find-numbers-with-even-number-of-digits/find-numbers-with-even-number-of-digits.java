class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            int num=0;
            int element=nums[i];
            while(element>0){
                element=element/10;
                num++;
            }
            if(num%2==0){
                count++;
            }

            
        }
        return count;
    }
}