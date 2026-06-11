class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int left=j+1;
                int right=nums.length-1;
                while(left<right){
                        long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                        if(sum>target){
                            right--;
                        }
                        else if(sum<target){
                            left++;
                        }
                        else{
                            result.add(Arrays.asList(nums[i],nums[j],nums[right],nums[left]));
                            
                            left++;
                            right--;
                        }
                    }
            }
        }
        return new ArrayList<>(result);
    }
}