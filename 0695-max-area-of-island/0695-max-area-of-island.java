class Solution {
   public int maxAreaOfIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        boolean fk = false;
        int x = 0;
        Dsu dsu = new Dsu(r * c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int magic = (c * i) + j;
                if (x == 0 && !fk) {
                    if (grid[i][j] == 1) {
                        x++;
                        fk = true;
                    }

                }
                if (i > 0) {
                    if (grid[i][j] == 1 && grid[i - 1][j] == 1) {
                        dsu.union(magic, magic - c);
                    }
                }
                if (j > 0) {
                    if (grid[i][j] == 1 && 1 == grid[i][j - 1]) {
                        dsu.union(magic, magic - 1);
                    }
                }
                if (i < r - 1) {
                    if (grid[i][j] == 1 && 1 == grid[i + 1][j]) {
                        dsu.union(magic, magic + c);
                    }
                }
                if (j < c - 1) {
                    if (grid[i][j] == 1 && 1 == grid[i][j + 1]) {
                        dsu.union(magic, magic + 1);
                    }
                }
            }
        }

        return dsu.count() == (r * c) && !fk ? 0 : dsu.MaxSetSize();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }

    public static class Dsu {
        int max;
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

