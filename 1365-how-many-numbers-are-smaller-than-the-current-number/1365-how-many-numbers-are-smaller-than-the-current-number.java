class Solution {
   public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        int[] copy = nums.clone();
        Sort(copy);
        for (int i = 0; i < nums.length; i++) {
            int x = Find(nums[i], copy);
            if (x == -1) res[i] = 0;
            else res[i] = x + 1;
        }
        return res;
    }

    public static int Find(int x, int[] a) {
        int res = -1, l = 0, r = a.length - 1, mid;
        while (l <= r) {
            mid = (l + r) >>> 1;
            if (a[mid] < x) {
                l = mid + 1;
                res = mid;
            } else r = mid - 1;
        }
        return res;
    }
    

    public static void Sort(int[] a) {
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i : a) lst.add(i);
        Collections.sort(lst);
        for (int i = 0; i < lst.size(); i++) a[i] = lst.get(i);
    }
}