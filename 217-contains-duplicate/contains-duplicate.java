import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set= new HashSet<>();
    for( int items:nums){
        set.add(items);
    }  
    if(set.size()==nums.length){
        return false;
    } 
    else{
      return true;
    }
    
    }
}