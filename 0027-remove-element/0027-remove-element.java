class Solution {
    
    public int removeElement(int[] nums, int val) {

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = -1;
                k++;
            }
        }


        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] == -1 && nums[j] != -1) {
                nums[i] = nums[j];
                nums[j] = -1;
                i++;
                j--;
            }
            if (nums[i] != -1) i++;
            if (nums[j] == -1) j--;
        }
        return nums.length - k;
    }

    
}