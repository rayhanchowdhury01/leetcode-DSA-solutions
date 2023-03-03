class Solution {
   public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char c : stones.toCharArray()) {
            if (mp.containsKey(c)) mp.put(c, mp.get(c) + 1);
            else mp.put(c, 1);
        }
        HashSet<Character> set = new HashSet<>();
        int res = 0;
        for (char c : jewels.toCharArray()) {
            if (mp.containsKey(c) && !set.contains(c)) {
                res += mp.get(c);
                set.add(c);
            }
        }
        return res;
    }
}