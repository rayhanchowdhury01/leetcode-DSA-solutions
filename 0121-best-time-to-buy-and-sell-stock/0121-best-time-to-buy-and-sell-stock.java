class Solution {
   public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int i : prices) {
            if (i < min) min = i;
            if (i - min > ans) ans = i - min;
        }
        return ans;
    }
}