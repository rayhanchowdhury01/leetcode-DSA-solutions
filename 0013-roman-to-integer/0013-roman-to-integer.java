class Solution {
    public int romanToInt(String s) {
        int res = 0, temp = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'I') temp = 1;
            else if (s.charAt(i) == 'V') temp = 5;
            else if (s.charAt(i) == 'X') temp = 10;
            else if (s.charAt(i) == 'L') temp = 50;
            else if (s.charAt(i) == 'C') temp = 100;
            else if (s.charAt(i) == 'D') temp = 500;
            else temp = 1000;
            if (temp * 4 < res) res -= temp;
            else res += temp;
        }
        return res;
    }

}