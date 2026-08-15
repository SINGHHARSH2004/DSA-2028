class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    void solve(int[] nums,ArrayList<Integer>list,HashSet<Integer> set){
       
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                list.add(nums[i]);
                solve(nums,list,set);
                list.remove(list.size() - 1);
                set.remove(nums[i]);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        solve(nums,list,set);
        return ans;
    }
}