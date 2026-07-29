
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        
       HashMap<Integer,Integer>map=new HashMap<>();
      for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    while(k>0){
        int key=0;
        int maxFreq=Integer.MIN_VALUE;
        for (int i : map.keySet()) {
    if (map.get(i) > maxFreq) {
        maxFreq = map.get(i);
       key=i;
    }
}
    list.add(key);
    map.remove(key);
    k--;
    }
    int[] arr = new int[list.size()];

for (int i = 0; i < list.size(); i++) {
    arr[i] = list.get(i);
}

    return arr;
    }
}