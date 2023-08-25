class Solution {
    public int findMin(int[] nums) {

        int l = 0, r = nums.length - 1;

        while (r > l) {
            int mid = (l + r) / 2;
            if (nums[mid] < nums[r]) r = mid;
            else l = mid + 1;
        }
        return nums[l];
    }
}