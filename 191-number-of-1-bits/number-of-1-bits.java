class Solution {
    public int hammingWeight(int n) {
        int num=0;
        String binary = Integer.toBinaryString(n);
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                num+=1;
            }
        }
        return num;
    }
}