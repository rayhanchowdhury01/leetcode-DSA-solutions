class Solution {
      public int[] productExceptSelf(int[] nums) {

        int[] res = new int[nums.length];
        int zero = 0, zeroIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
                nums[i] = 1;
                zeroIndex = i;
            }
            if (zero > 1) break;
        }
        if (zero > 1) return res;
        else {
            int[] x = new int[nums.length];
            for (int i = 0; i < nums.length; i++) x[i] = nums[i];
            for (int i = 1; i < nums.length; i++) nums[i] *= nums[i - 1];
            if (zeroIndex != -1) {
                res[zeroIndex] = nums[nums.length - 1];
                return res;
            } else {
                for (int i = 0; i < nums.length; i++) {
                    res[i] = (nums[nums.length - 1] / x[i]);
                }
                return res;
            }
        }
      }
}