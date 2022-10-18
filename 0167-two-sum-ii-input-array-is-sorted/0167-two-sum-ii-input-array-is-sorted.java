class Solution {
      public int[] twoSum(int[] arr, int target) {
        int[] a = new int[2];
        int f = -1, s = -1;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i], tempInxd = i;
            int l = 0, r = arr.length - 1;
            while (l <= r) {
                //debug(l,r+"...");
                int mid = l + (r - l) / 2;
                if (temp + arr[mid] == target && tempInxd != mid) {
                    f = tempInxd;
                    s = mid;
                }
                if (temp + arr[mid] > target) r = mid - 1;
                else l = mid + 1;
            }
            //debug(l,r);
        }
        f++;
        s++;
        a[0] = Math.min(f, s);
        a[1] = Math.max(f, s);
        return a;
    }
}