class Solution {
    public int appendCharacters(String s, String t) {
        if (s.length() == 0) {
            return t.length();
        }
        int n = t.length() - 1;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            if (end < t.length() && s.charAt(i) == t.charAt(end)) {
                end++;
            }
        }
        return n - end + 1;
    }
}