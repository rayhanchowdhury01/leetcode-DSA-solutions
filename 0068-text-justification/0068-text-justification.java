class Solution {
   
     public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        List<String> currrentLine = new ArrayList<>();

        int x = 0, w = 0;
        while (x < words.length) {
            String Cword = words[x];

            if (w + Cword.length() <= maxWidth) {
                currrentLine.add(Cword);
                w += Cword.length() + 1;
                x++;
            } else {
                int spaces = maxWidth - w + currrentLine.size();

                int add = 0, i = 0;

                while (add < spaces) {
                    if (i >= currrentLine.size() - 1) {
                        i = 0;
                    }

                    currrentLine.set(i, currrentLine.get(i) + " ");
                    add++;
                    i++;
                }

                result.add(String.join("", currrentLine));

                currrentLine.clear();
                w = 0;
            }
        }

        for (int word = 0; word < currrentLine.size() - 1; word++) {
            currrentLine.set(word, currrentLine.get(word) + " ");
        }
        currrentLine.set(currrentLine.size() - 1, currrentLine.get(currrentLine.size() - 1) + " ".repeat(maxWidth - w + 1));

        result.add(String.join("", currrentLine));

        return result;
    }
}