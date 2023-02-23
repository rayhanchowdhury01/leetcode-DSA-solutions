class Solution {
    public int search(int[] nums, int target) {
        
        int l = 0, r = nums.length - 1, mid;
        while (l <= r) {
            mid = l + (r - l) / 2;

            if (nums[mid] == target) return mid;

            if (nums[l] <= nums[mid]) {
                if (target < nums[mid] && target >= nums[l]) r = mid - 1;
                else l = mid + 1;
            }

            if (nums[r] >= nums[mid]) {
                if (target <= nums[r] && target > nums[mid]) l = mid + 1;
                else r = mid - 1;
            }
        }
        return -1;
    }
}