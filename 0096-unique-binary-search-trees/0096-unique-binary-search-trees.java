class Solution {
    
     public int numTrees(int n) {
        return catalan(n);
    }

    public int catalan(int n) {
        int res = 0;
        if (n <= 1) return 1;
        for (int i = 0; i < n; i++) res += catalan(i) * catalan(n - (i + 1));
        return res;
    }
    
    /* public int numTrees(int n) {
        return Tree(1, n);
    }

    public int Tree(int l, int r) {
        if (r <= l) return 1;
        int res = 0;
        for (int i = l; i <= r; i++) res += Tree(l, i - 1) * Tree(i + 1, r);

        return res;
    }*/
}