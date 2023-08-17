class Solution {
    public int maxCoins(int[] piles) {
        int n = piles.length;
        Arrays.sort(piles);
        int i = ((n / 3) + n % 3) - 1;
        int j = n - 2, res = 0;
        while (j > i) {
            res += piles[j];
            j -= 2;
        }
        return res;
    }
}