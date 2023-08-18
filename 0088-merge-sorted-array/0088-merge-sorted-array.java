
class Solution {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[n + m];
        for (int i = 0; i < m; i++) res[i] = nums1[i];
        for (int i = 0; i < n; i++) res[i + m] = nums2[i];
        for (int i = 0; i < n + m; i++) nums1[i] = res[i];
        Arrays.sort(nums1);
    }
   
}