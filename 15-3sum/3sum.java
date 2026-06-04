import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3 || nums.length== 0){
            List<List<Integer>> sum=new ArrayList<>();
            return sum;
        }
        Arrays.sort(nums);
        Set<List<Integer>> result= new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
               int sum=nums[left]+nums[right]+ nums[i];
                if(sum== 0){
                    result.add(Arrays.asList(nums[i],nums[right],nums[left]));
                    left++;
                    right--;
                }
                else if(sum>0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return new ArrayList<>(result);
    }
}