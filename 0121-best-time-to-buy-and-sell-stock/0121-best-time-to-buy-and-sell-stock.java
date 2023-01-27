class Solution {
   public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int res = 0;
        for (int i : prices) {
            if (i < min) min = i;
            if (i - min > res) res = i - min;
        }
        return res;
    }
}