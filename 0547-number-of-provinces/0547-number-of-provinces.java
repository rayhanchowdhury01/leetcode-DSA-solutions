class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        Dsu dsu = new Dsu(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i != j) dsu.union(i, j);
            }
        }
        return dsu.numberOfset;
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
    }
}