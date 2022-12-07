class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Dsu dsu = new Dsu(n);
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            dsu.union(u, v);
        }
        return dsu.findSet(source)==dsu.findSet(destination);
    }

    public static class Dsu {
        int n;
        int[] parent;

        public Dsu(int n) {
            this.n = n;
            parent = new int[n+1];
            for(int i=0;i<n+1;i++)
                parent[i]=i;
        }


        public int findSet(int u) {
            if (u == parent[u]) return u;
            return parent[u] = findSet(parent[u]);
        }

        public void union(int u, int v) {
            u = findSet(u);
            v = findSet(v);
            if (u == v) return;
            //debug(u + "<<--u " + " v-->>" + v);
            //union by size
            parent[v] = u;
        }

        public int count() {
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (i == parent[i]) cnt++;
            }
            return cnt;
        }

    }
}