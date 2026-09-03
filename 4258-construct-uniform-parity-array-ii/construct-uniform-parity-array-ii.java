class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=Arrays.stream(nums1).min().getAsInt();
        if(min%2!=0){
            return true;

        }

        for(int nums:nums1){
            if(nums%2==1){
                return false;
            }
        }
        return true;
    }
}