class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] res = new int[2];
        int n = edges.length;
        Dsu dsu = new Dsu(n);
        for (int[] i : edges) {
            boolean x = dsu.union(i[0] - 1, i[1] - 1);
            if (!x) {
                res[0] = i[0] ;
                res[1] = i[1] ;
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

        public boolean union(int u, int v) {
            u = findSet(u);
            v = findSet(v);
            if (u == v) return false;
            if (setSize[u] <= setSize[v]) {
                int temp = u;
                u = v;
                v = temp;
            }
            parent[v] = u;
            setSize[u] += setSize[v];
            numberOfset--;
            return true;
        }
    }
}