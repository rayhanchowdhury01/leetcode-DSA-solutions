class Solution {
    public boolean isPowerOfThree(int n) {
        double res = Math.log10(n) / Math.log10(3);
        return res - (int) res == 0;
    }
}