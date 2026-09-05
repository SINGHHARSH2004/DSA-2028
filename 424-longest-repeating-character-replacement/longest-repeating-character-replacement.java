class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int right = 0;
        int maxFreq = 0;
        int ans = 0;
        while (right < s.length()) {
            char ch = s.charAt(right);
            freq[ch - 'A']++;
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);
            int windowSize = right - left + 1;
            int replace = windowSize - maxFreq;
            while (replace > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
                windowSize = right - left + 1;
                replace = windowSize - maxFreq;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}