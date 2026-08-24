class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2= new HashMap<>();
        
     

    // String[] arr1 = s.split("");
    // String[] arr2 = t.split("");
        
           
    //      for(String items:arr1){
    //         map1.put(items,map1.getOrDefault(items,0)+1);
    //     }

    //     for(String items:arr2){
    //         map2.put(items,map2.getOrDefault(items,0)+1);
    //     }
    //         if(map1.equals(map2)){
    //             return true;
    //         }
    //         return false;

    // for(int i=0;i<s.length();i++){
    //     char items=s.charAt(i);
    //      map1.put(items,map1.getOrDefault(items,0)+1);
    // }

    //  for(int i=0;i<t.length();i++){
    //     char items=t.charAt(i);
    //      map2.put(items,map2.getOrDefault(items,0)+1);
    // }

    //          if(map1.equals(map2)){
    //             return true;
    //         }
    //         return false;


    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        map1.put(ch,map1.getOrDefault(ch,0)+1);
    }

    for(int i=0;i<t.length();i++){
        char ch=t.charAt(i);
        map2.put(ch,map2.getOrDefault(ch,0)+1);
    }
        if(map1.equals(map2)){
            return true;
        }

        return false;
    }
}