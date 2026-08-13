class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int totalSum=0;
        int result=0;
        int rem=0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
                rem=totalSum % k;
               if(rem<0){
                rem+=k;
               }
                if (map.containsKey(rem)) {
                result += map.get(rem);
            }
             map.put(rem, map.getOrDefault(rem, 0) + 1);
    }
        return result;
    }
}