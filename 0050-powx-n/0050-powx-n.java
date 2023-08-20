class Solution {
    public double myPow(double x, int n) {
        if (n < 0) return Helper(1 / x, Math.abs((long) n));
        else return Helper(x, n);
    }

    public double Helper(double x, long n) {
        if (n == 0) return 1.0;
        if (x == 0) return 0.0;
        if (n % 2 == 0) return Helper(x * x, n / 2);
        else return x * Helper(x, n - 1);
    }
}