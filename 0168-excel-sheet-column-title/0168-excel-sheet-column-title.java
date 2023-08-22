class Solution {
    public String convertToTitle(int columnNumber) {
        
        String res = "";
        while (columnNumber > 0) {
            char ch = (char) ('A' + (columnNumber - 1) % 26);
            res = ch + res;
            columnNumber = (columnNumber - 1) / 26;
        }
        return new String(res);
        
    }
}