class Solution {
    public List<String> stringMatching(String[] words) {
        Arrays.sort(words);
        HashMap<String,String>map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){

                    if(words[j].contains(words[i])&& i!=j){
                        map.put(words[i],words[j]);
                    }
            }
        }
       ArrayList<String> list = new ArrayList<>(map.keySet());
return list;
    }
}