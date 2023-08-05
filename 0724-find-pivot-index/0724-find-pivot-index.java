class Solution {
   public int pivotIndex(int[] nums) {

        int pre = 0, temp = 0;
        for (int i : nums) pre += i;
        for (int i = 0; i < nums.length; i++) {
            pre -= nums[i];
            if (temp == pre) return i;
            temp += nums[i];
        }
        return -1;
    }
}