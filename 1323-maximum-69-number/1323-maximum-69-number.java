class Solution {
     public int maximum69Number(int num) {
        char[] res = String.valueOf(num).toCharArray();
        for (int i = 0; i < res.length; i++) {
            if (res[i] == '6') {
                res[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(res));
    }
}