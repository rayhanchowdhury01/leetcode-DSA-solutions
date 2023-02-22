class Solution {
     public int firstMissingPositive(int[] nums) {
        int maxelement = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
            maxelement = Math.max(maxelement, i);
        }
        if (maxelement < 1) return 1;
        for (int i = 1; i <= maxelement; i++) {
            if (!set.contains(i)) return i;
        }
        return maxelement + 1;
    }
}