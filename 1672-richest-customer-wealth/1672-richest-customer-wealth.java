class Solution {
   public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int row = accounts.length;
        int col = accounts[0].length;
        for (int[] i : accounts) {
            int x = 0;
            for (int j = 0; j < col; j++) {
                x += i[j];
            }
            max = Math.max(x, max);
            x = 0;
        }
        return max;
    }
}