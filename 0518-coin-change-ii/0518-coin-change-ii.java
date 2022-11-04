class Solution {
   public int change(int amount, int[] coins) {
        if (amount == 0) return 1;
        if (coins == null || amount < 0 || coins.length == 0) return 0;
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int c : coins) {
            for (int i = c; i <= amount; i++) {
                dp[i] += dp[i - c];
                // debug(dp[i]);
            }
            //debug(dp, c);
        }
        return dp[amount];
    }
}