class Solution {
     public static int[] createTargetArray(int[] nums, int[] index) {
        int[] a = new int[nums.length];
        for (int i = 0; i < a.length; i++) {
            int indx = index[i];
            if (indx < i) {
                int temp = i;
                while (indx < temp) {
                    a[temp] = a[temp - 1];
                    temp--;
                }
                a[indx] = nums[i];

            } else a[indx] = nums[i];
        }
        return a;
    }
   
}