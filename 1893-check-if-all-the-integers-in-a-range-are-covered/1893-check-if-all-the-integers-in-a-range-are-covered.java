class Solution {
   public boolean isCovered(int[][] ranges, int left, int right) {
        boolean flag = false;
        for (int i = left; i <= right; i++) {
            for (int[] j : ranges) {
                if (j[0] <= i && j[1] >= i) {
                    flag = true;
                    break;
                }
            }
            if (!flag) return flag;
            flag = false;
        }
        return true;
    }
}