class Solution {
    
     public int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) res[i] = nums[nums[i]];
        return res;
    }
    
    /*public int[] buildArray(int[] nums) {
        int x = nums.length;
        for (int i = 0; i < nums.length; i++)
            nums[i] = (nums[nums[i]] % x) * x + nums[i];
        for (int i = 0; i < nums.length; i++) nums[i] /= x;
        return nums;
      }*/
    }