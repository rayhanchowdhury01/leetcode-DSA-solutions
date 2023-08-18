class Solution {
   public static String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();
        String res = "";
        char[] ch = s.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            if (ch[i] == ' ') continue;
            while (i >= 0 && ch[i] != ' ') {
                res = ch[i] + res;
                i--;
            }
            sb.append(res);
            sb.append(" ");
            res = "";
        }
        int lastIndex = sb.lastIndexOf(" ");
        if (lastIndex != -1) {
            sb.deleteCharAt(lastIndex);
        }

        return new String(sb);
    }

}