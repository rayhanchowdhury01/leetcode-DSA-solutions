class Solution {
     public int majorityElement(int[] nums) {
        int res = 0, count = 0;
        for (int i : nums) {
            if (count == 0) res = i;
            if (i != res) count--;
            else count++;
        }
        return res;
    }
    
}