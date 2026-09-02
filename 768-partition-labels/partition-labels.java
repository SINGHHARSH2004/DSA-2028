class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] arr = new int[26];

for (int i = 0; i < s.length(); i++) {
    int index = s.charAt(i) - 'a';
    arr[index] = i;
}
List<Integer>list=new ArrayList<>();
   int start=0;
   int end=0;
   for(int i=0;i<s.length();i++){
    end=Math.max(end,arr[s.charAt(i)-'a']);
        if(i==end){
            list.add(end-start+1);
            start=i+1;
        }
   }
   return list;
}
}