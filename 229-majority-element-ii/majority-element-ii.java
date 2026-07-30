class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int items:nums){
            map.put(items,map.getOrDefault(items,0)+1);
        }
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int items:map.keySet()){
            if(map.get(items)>n/3){
                list.add(items);
            }
        }
        return list;
    }
}