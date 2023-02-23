class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> set1 = new HashMap<>();
        HashMap<Integer, Integer> set2 = new HashMap<>();
        for (int i : nums1) {
            if (set1.containsKey(i)) set1.put(i, set1.get(i) + 1);
            else set1.put(i, 1);
        }
        for (int i : nums2) {
            if (set2.containsKey(i)) set2.put(i, set2.get(i) + 1);
            else set2.put(i, 1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if (nums1.length <= nums2.length) {
            for (int i : nums1) {
                if (set2.containsKey(i) && set2.get(i) > 0) {
                    ans.add(i);
                    set2.put(i, set2.get(i) - 1);
                }
            }
        } else {
            for (int i : nums2) {
                if (set1.containsKey(i) && set1.get(i) > 0) {
                    ans.add(i);
                    set1.put(i, set1.get(i) - 1);
                }
            }
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < res.length; i++) res[i] = ans.get(i);
        
        return res;

    }


}