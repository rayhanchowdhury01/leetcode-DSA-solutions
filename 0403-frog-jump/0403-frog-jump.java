class Solution {
    public boolean canCross(int[] stones) {
        int len = stones.length;
        boolean[][] dp = new boolean[len][len + 1];
        dp[0][1] = true;

        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                int dist = stones[i] - stones[j];

                if (dist <= j + 1) {
                    dp[i][dist] = dp[j][dist - 1] || dp[j][dist] || dp[j][dist + 1];
                    if (i == len - 1 && dp[i][dist]) return true;
                }
            }
        }
        return false;
    }
}