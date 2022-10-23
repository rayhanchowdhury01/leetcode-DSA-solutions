class Solution {
     public boolean checkIfPangram(String sentence) {
        int[] freq = new int[26];
        char[] ch = sentence.toCharArray();
        for (char c : ch) freq[c - 'a']++;
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) return false;
        }
        return true;
    }
}