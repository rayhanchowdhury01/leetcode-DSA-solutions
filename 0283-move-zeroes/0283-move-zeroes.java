class Solution {
    public void moveZeroes(int[] nums) {
        
        int indx = 0;
        for(int i : nums){
            if(i != 0) nums[indx++] = i;
        }
        for(int i = indx;i < nums.length;i++) nums[i] = 0;
    }
}