class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashSet<Character>set=new HashSet<>();
     int start=0,end=0,max=0;
     while(end<s.length()){
        char ch =s.charAt(end);
        if(set.contains(ch)){
            while(set.contains(ch)){
                set.remove(s.charAt(start));
                start++;
            }
        }
        set.add(ch);
        max=Math.max(max,end-start+1);
        end++;
     }   
     return max;
    }
}