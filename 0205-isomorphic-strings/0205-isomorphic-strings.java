class Solution {
     public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false;
        Map<Character, Character> mp = new HashMap<>();
        Map<Character, Character> mp1 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mp.getOrDefault(c1, c2) != c2 || mp1.getOrDefault(c2, c1) != c1) return false;
            else {
                mp.put(c1, c2);
                mp1.put(c2, c1);
            }
        }

        return true;
    }
}