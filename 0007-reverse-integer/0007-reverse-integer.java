class Solution {
    public int reverse(int n) {
        boolean flag = false;
        if (n < 0) {
            n *= -1;
            flag = true;
        }
        long res = 0;
        while (n > 0) {
            res = res * 10 + n % 10;
            n /= 10;
        }
        if (res > Integer.MAX_VALUE) return 0;
        return (int) (flag ? (-1 * res) : res);
        
    }
}