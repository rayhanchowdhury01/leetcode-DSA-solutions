
public class Solution {
    static int N;
    static ArrayList<Integer> adj[];

    public boolean possibleBipartition(int n, int[][] dislikes) {
        N = n;
        adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) adj[i] = new ArrayList<>();
        for (int[] node : dislikes) {
            int u = node[0];
            int v = node[1];
            adj[u].add(v);
            adj[v].add(u);
        }
        Dsu dsu = new Dsu(N);
        for (int i = 1; i <= N; i++) {
            if (adj[i].size() == 0) continue;
            int x = adj[i].get(0);
            for (int node : adj[i]) {
                if (dsu.IsSame(i, node)) return false;
                dsu.Union(x, node);
            }
        }
        return true;
    }

    public class Dsu {
        int[] parent, rank;

        Dsu(int N) {
            parent = new int[N + 1];
            rank = new int[N + 1];
            for (int i = 0; i <= N; i++) parent[i] = i;
        }

        public boolean IsSame(int u, int v) {
            return FindSet(u) == FindSet(v);
        }


        public int FindSet(int u) {
            if (u == parent[u]) return u;
            else return parent[u] = FindSet(parent[u]);
        }

        public void Union(int u, int v) {
            u = FindSet(u);
            v = FindSet(v);
            if (u == v) return;
            if (rank[u] > rank[v]) {
                parent[v] = u;
                rank[u]++;
            } else {
                parent[u] = v;
                rank[v]++;
            }
        }

    }

}