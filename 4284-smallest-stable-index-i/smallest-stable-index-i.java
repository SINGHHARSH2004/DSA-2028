class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        for (int i = 0; i < nums.length; i++) {
    int min = Arrays.stream(nums, i,nums.length ).min().getAsInt();
    int max = Arrays.stream(nums, 0, i+1).max().getAsInt();
    if( Math.abs(max-min)<=k){
        return i;
    }

    }
    return -1;
}
}