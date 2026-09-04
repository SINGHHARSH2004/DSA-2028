class Solution {
    public int strStr(String h, String n) {
        if(h.equals(n)){
            return 0;
        }
        int len1=h.length();
        int len2=n.length();
        for(int i=0;i<=len1-len2;i++){
            if(h.substring(i,i+len2).equals(n)){
                return i;
            }

        }
        return -1;
    }
}