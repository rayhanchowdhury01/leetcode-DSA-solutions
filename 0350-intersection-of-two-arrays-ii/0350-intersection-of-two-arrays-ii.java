class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> lst = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) i++;
            else if (nums1[i] > nums2[j]) j++;
            else {
                lst.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] res = new int[lst.size()];
        for (int v : lst) res[k++] = v;

        return res;
    }

}