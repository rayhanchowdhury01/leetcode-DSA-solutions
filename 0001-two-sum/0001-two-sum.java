class Solution {
     public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(target - nums[i])) return new int[]{mp.get(target - nums[i]), i};
            else mp.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
   
}