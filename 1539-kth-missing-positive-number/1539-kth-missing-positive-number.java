class Solution {
    public int findKthPositive(int[] a, int k) {
        int l = 0, r = a.length, mid;
        while (l < r) {
            mid = l + (r - l) / 2;
            if (a[mid] - (mid + 1) < k) l = mid + 1;
            else r = mid;
        }
        return l + k;
    }
}