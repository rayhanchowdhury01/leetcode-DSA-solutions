class Solution {
     public long minimumReplacement(int[] A) {
        long x = 1000000000, res = 0, k;
        for (int i = A.length - 1; i >= 0; --i) {
            k = (A[i] + x - 1) / x;
            x = A[i] / k;
            res += k - 1;
        }
        return res;
    }
}