import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set= new HashSet<>();
    // for( int items:nums){
    //     set.add(items);
    // }
    for (int num : nums) {
    if (!set.add(num)) {   // add() returns false if already present
        return true;       // duplicate found
    }
}
   
  return false;
    
    }
}