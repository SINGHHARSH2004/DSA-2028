class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int start = 0, end = 0;
        ArrayList<String> list = new ArrayList<>();
        while (end < s.length()) {
            if (s.charAt(end) == '1') {
                k--;
            }
            end++;
            if (k == 0) {
                String str = s.substring(start, end);
                list.add(str);
                while (k <= 0) {
                    if (s.charAt(start) == '1') {
                        k++;
                    }
                    start++;
                    
                    if (k == 0) {
                        str = s.substring(start, end);
                        list.add(str);
                    }
                }
            }
        }
        String ans = "";
        int len = Integer.MAX_VALUE;

        for (String str : list) {
            if (str.length() < len) {
                ans = str;
                len = str.length();
            } else if (str.length() == len && str.compareTo(ans) < 0) {
                ans = str;
            }
        }

        return ans;
    }
}