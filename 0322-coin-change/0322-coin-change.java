class Solution {
     public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (coins == null || amount < 0 || coins.length == 0) return -1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int c : coins) {
            for (int i = c; i <= amount; i++) {
                if (dp[i - c] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], (dp[i - c] + 1));
                    //debug(dp[i]);
                }
               // debug(dp, i);
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
   
}