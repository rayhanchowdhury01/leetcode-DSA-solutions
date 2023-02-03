class Solution {
   public String longestCommonPrefix(String[] strs) {
        int len = strs.length, i = 0;
        Arrays.sort(strs);
        if (len == 0) return "";
        String f = strs[0], l = strs[len - 1];
        while (i < f.length()) {
            if (f.charAt(i) == l.charAt(i)) i++;
            else break;
        }
        return i == 0 ? "" : f.substring(0, i);
    }
}