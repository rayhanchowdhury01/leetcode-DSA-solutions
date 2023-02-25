class Solution {
   public int sumOddLengthSubarrays(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int freq = ((i + 1) * (arr.length - i) + 1) / 2;
            sum += arr[i] * freq;
            //debug(freq);
        }
        return sum;
    }
}