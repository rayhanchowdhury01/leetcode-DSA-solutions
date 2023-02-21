class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i : nums) {
            if (mp.containsKey(i)) mp.put(i, mp.get(i) + 1);
            else mp.put(i, 1);
        }
        
        int res = 0;
        for (Map.Entry<Integer, Integer> i : mp.entrySet()) {
            if (i.getValue() > nums.length / 2) {
                res = i.getKey();
                break;
            }
        }
        
        return res;
    }
    
}