class Solution {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Sort(nums1);
        Sort(nums2);
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
     public static void Sort(int[] a) {
        List<Integer> l = new ArrayList<>();
        for (int i : a) l.add(i);
        Collections.sort(l);
        for (int i = 0; i < a.length; i++) a[i] = l.get(i);
    }

}