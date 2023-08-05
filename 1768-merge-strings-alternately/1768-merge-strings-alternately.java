class Solution {
    public String mergeAlternately(String word1, String word2) {

        if (word1.length() == 0) return word2;
        if (word2.length() == 0) return word1;

        int len = Math.min(word1.length(), word2.length());
        String res = "";
        int x = 0;
        for (int i = 0; i < len; i++) {
            res += word1.charAt(i);
            res += word2.charAt(i);
            x++;
        }
        String temp = (word1.length() > word2.length() ? word1 : word2);
        for (int i = x; i < temp.length(); i++) res += temp.charAt(i);

        return res;
    }
}