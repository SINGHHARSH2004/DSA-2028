class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s3="";
        String s1=strs[0];
        String s2=strs[strs.length-1];
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
                s3+=s1.charAt(i);
            }
            else{
                return s3;
            }
        }
        return s3;
    }
}