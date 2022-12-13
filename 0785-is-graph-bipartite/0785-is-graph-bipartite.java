
class Solution {
    public boolean isBipartite(int[][] graph) {
        Dsu dsu = new Dsu(graph.length);
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (dsu.isSame(i, graph[i][j])) return false;
                dsu.unionSets(graph[i][0], graph[i][j]);
            }
        }
        return true;
    }

    public static class Dsu {
        int n, numberOfset;
        int[] parent, setSize, rank;

        Dsu(int n) {
            this.n = n;
            numberOfset = n;
            parent = new int[n];
            rank = new int[n];
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

        public void unionSets(int a, int b) {//union by rank
            a = findSet(a);
            b = findSet(b);
            if (a != b) {
                if (rank[a] < rank[b]) {
                    int t = a;
                    a = b;
                    b = t;
                }
                parent[b] = a;
                if (rank[a] == rank[b]) {
                    rank[a]++;
                }
            }
        }

        public boolean isSame(int u, int v) {
            return findSet(u) == findSet(v);
        }
    }

}

