class Solution {
    public String replaceWords(List<String> dic, String s) {
        HashMap<String,Boolean>map=new HashMap<>();
        for(String root:dic){
            map.put(root,true);
        }
        String[] word=s.split(" ");
        for(int i=0;i<word.length;i++){
            String str=word[i];
            for(int j=1;j<=str.length();j++){
                if(map.containsKey(str.substring(0,j))){
                    word[i]=str.substring(0,j);
                    break;
                }
            }
        }
        return String.join(" ",word);
    }
}