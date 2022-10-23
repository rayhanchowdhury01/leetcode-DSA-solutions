class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i : nums) {
            int p = mp.getOrDefault(i, 0);
            res += p;
            mp.put(i, p + 1);
        }
        return res;
    }
}
    