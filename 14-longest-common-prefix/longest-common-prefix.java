class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s3="";
        for(int i=0;i<strs[0].length();i++){
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
                s3+=strs[0].charAt(i);
            }
            else{
                return s3;
            }
        }
        return s3;
    }
}