class Solution {
        public static String[] findWords(String[] words) {

        if(words.length==0) return new String[]{""};

        HashSet<Character> set0 = new HashSet<>();
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        String s0 = "qwertyuiopQWERTYUIOP";
        String s1 = "asdfghjklASDFGHJKL";
        String s2 = "zxcvbnmZXCVBNM";

        for (char c : s0.toCharArray()) set0.add(c);
        for (char c : s1.toCharArray()) set1.add(c);
        for (char c : s2.toCharArray()) set2.add(c);


        ArrayList<String> res = new ArrayList<>();
        for (String s : words) {
            int count = 0;

            for (char c : s.toCharArray()) {
                if (set0.contains(c)) count++;
            }
            if (count == s.length()) {
                res.add(s);
                continue;
            } else count = 0;

            for (char c : s.toCharArray()) {
                if (set1.contains(c)) count++;
            }
            if (count == s.length()) {
                res.add(s);
                continue;
            } else count = 0;

            for (char c : s.toCharArray()) {
                if (set2.contains(c)) count++;
            }
            if (count == s.length()) res.add(s);


        }
        String[] ans = new String[res.size()];
        int x = 0;
        for (String i : res) ans[x++] = i;
        return ans;
    }
}