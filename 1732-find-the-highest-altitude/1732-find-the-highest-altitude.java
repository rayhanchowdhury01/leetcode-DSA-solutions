class Solution {
    public int largestAltitude(int[] gain) {

        if (gain.length == 1) {
            return gain[0] < 0 ? 0 : gain[0];
        }
        int res = Math.max(gain[0], 0);
        for (int i = 1; i < gain.length; i++) {
            gain[i] += gain[i - 1];
            if (res < gain[i]) res = gain[i];
        }
        return res;
    }
}