class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int res = 0, l = 0, r = n - 1;

        while (l < r) {
            res = Math.max(res, ((r - l) * Math.min(height[l], height[r])));
            if (height[l] < height[r]) l++;
            else r--;
        }
        return res;
    }
}