class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] arr1=pattern.split("");
        String[] arr2=s.split(" ");
        if(arr1.length!=arr2.length)return false;
        HashMap<String,String>map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            String a=arr1[i];
            String b=arr2[i];
                if(!map.containsKey(a)){
                    if(!map.containsValue(b)){
                        map.put(a,b);
                    }
                    else{
                        return false;
                    }
                }
                else{
                    String c=map.get(a);
                    if(!c.equals(b)){
    return false;
}
                }
        }
        return true;
    }
}