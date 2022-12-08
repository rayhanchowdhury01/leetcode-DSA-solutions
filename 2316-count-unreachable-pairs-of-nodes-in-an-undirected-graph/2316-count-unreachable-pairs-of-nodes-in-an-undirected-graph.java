
class Solution {
    public long countPairs(int n, int[][] edges) {

        Dsu dsu = new Dsu(n);
        for (int[] i : edges) {
            dsu.union(i[0], i[1]);
        }
        long res = 0;
        int temp = n;
        for (int i = 0; i < temp; i++) {
            if (i == dsu.parent[i]) {
                int x = dsu.setSize[dsu.parent[i]];
                n -= x;
                res += ((long) x * n);
            }
        }
        return res;
    }

    public static class Dsu {
        int n, numberOfset;
        int[] parent, setSize;

        Dsu(int n) {
            this.n = n;
            numberOfset = n;
            parent = new int[n];
            setSize = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                setSize[i] = 1;
            }
        }

        public int findSet(int u) {
            if (u == parent[u]) return u;
            return parent[u] = findSet(parent[u]);
        }

        public boolean isSameSet(int u, int v) {
            return findSet(u) == findSet(v);
        }

        public void union(int u, int v) {
            u = findSet(u);
            v = findSet(v);
            if (u == v) return;
            if (setSize[u] <= setSize[v]) {
                int temp = u;
                u = v;
                v = temp;
            }
            parent[v] = u;
            setSize[u] += setSize[v];
            numberOfset--;
        }

        public int MaxSetSize() {
            int max = 0;
            for (int i : setSize) if (i > max) max = i;
            return max;
        }

        public int count() {
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (i == parent[i]) cnt++;
            }
            return cnt;
        }

        public int setSize(int u) {
            return setSize[u] = findSet(u);
        }

    }
}
