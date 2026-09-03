class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
               if (isPalindromic(i,j,s)){
                count++;
               }
            }
        }
return count;
    }
  boolean  isPalindromic(int i,int j,String s){
    int start=i;
    int end=j;
    while(start<=end){
        if(s.charAt(start)!=s.charAt(end)){
        return false;    
        }
        start++;
        end--;
    }
    return true;
  }
}