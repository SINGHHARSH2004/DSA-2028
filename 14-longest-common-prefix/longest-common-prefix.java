class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        String ch="";
        Arrays.sort(strs);
        String s=strs[0];
        String t=strs[strs.length-1];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==t.charAt(i)){
                    ch=ch+s.charAt(i);
            }
            else{
                return ch;
            }
        }
        return ch;
    }
}