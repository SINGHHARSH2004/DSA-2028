class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<String,Integer> map1=new HashMap<>();
        HashMap<String,Integer> map2= new HashMap<>();

     

    String[] arr1 = s.split("");
    String[] arr2 = t.split("");
        
           
         for(String items:arr1){
            map1.put(items,map1.getOrDefault(items,0)+1);
        }

        for(String items:arr2){
            map2.put(items,map2.getOrDefault(items,0)+1);
        }
            if(map1.equals(map2)){
                return true;
            }
            return false;
    }
}