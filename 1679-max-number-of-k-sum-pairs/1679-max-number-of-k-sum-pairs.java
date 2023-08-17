class Solution {
    public int maxOperations(int[] nums, int k) {
        nums = sort(nums);
        int i = 0, j = nums.length - 1;
        int res = 0;

        while (i < j) {
            if (nums[i] + nums[j] == k) {
                res++;
                i++;
                j--;
            } else if (nums[i] + nums[j] > k) j--;
            else i++;

        }
        return res;
    }

    private int[] sort(int[] a) {
        ArrayList<Integer> aa = new ArrayList<>();
        for (int i = 0; i < a.length; i++) aa.add(a[i]);
        Collections.sort(aa);
        for (int i = 0; i < a.length; i++) a[i] = aa.get(i);
        return a;
    }

}