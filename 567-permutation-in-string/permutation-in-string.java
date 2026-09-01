class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int  n1=s1.length();
        int n2= s2.length();
        if(n1>n2){
            return false;
        }
        char[] arr1=s1.toCharArray();
        Arrays.sort(arr1);
        String str1=new String(arr1);

        for(int i=0;i<=n2-n1;i++){
            String substring=s2.substring(i,i+n1);
            char[] arr2=substring.toCharArray();
        Arrays.sort(arr2);
        String str2=new String(arr2);
                if(str1.equals(str2)){
                    return true;
                }
        }
        return false;
    }
}