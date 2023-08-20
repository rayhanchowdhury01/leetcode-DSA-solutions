class Solution {
    public boolean isPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') res += c;
            if (c >= 'A' && c <= 'Z') res += (char) (c + 32);
            if (c >= '0' && c <= '9') res += c;
        }
        return Helper(res);
    }

    public boolean Helper(String s) {
        if (s.length() < 2) return true;
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}