class Solution {
   public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int row = accounts.length, x = 0;
        int col = accounts[0].length;
        for (int[] i : accounts) {
            x=0;
            for (int j = 0; j < col; j++) {
                x += i[j];
            }
            max = Math.max(x, max);
        }
        return max;
    }
}