class Solution {
    static class Pair implements Comparable<Pair> {
        int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int compareTo(Pair ob) {
            return second - ob.second;
        }
    }

    public int findLongestChain(int[][] pairs) {
        ArrayList<Pair> p = new ArrayList<>();
        for (int[] i : pairs) p.add(new Pair(i[0], i[1]));
        Collections.sort(p);
        int res = 0, pre = p.get(0).second;
        for (int i = 1; i < p.size(); i++) {
            if (p.get(i).first > pre) {
                res++;
                pre = p.get(i).second;
            }
        }
        return res + 1;

    }
}