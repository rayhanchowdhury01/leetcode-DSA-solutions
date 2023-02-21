class Solution {
     public int firstUniqChar(String s) {

        int[] fre = new int[26];
        for (char c : s.toCharArray()) {
            fre[c - 'a']++;
        }
        int res = -1;
        for (int i = 0; i < s.length(); i++) {
            if (fre[s.charAt(i) - 'a'] == 1) {
                res = i;
                break;
            }
        }
        return res;
    }
}