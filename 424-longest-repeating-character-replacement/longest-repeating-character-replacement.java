class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int maxlen = 0;
        int maxfreq = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (r < s.length()) {
            int ch = s.charAt(r) - 'a';
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxfreq = Math.max(maxfreq, map.get(ch));
            while ((r - l + 1) - maxfreq > k) {
                int left = s.charAt(l) - 'a';
                map.put(left, map.get(left) - 1);
                l++;
            }
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }

        return maxlen;
    }
}