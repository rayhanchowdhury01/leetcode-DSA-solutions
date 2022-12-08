class Solution {
        int[][] g;
        int n, m;

        public int maxAreaOfIsland(int[][] grid) {
            g = grid.clone();
            n = g.length;
            m = g[0].length;

            int res = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (g[i][j] == 1) {
                        res = Math.max(dfs(i, j), res);
                    }
                }
            }
            return res;
        }

        public int dfs(int i, int j) {
            if (i < 0 || i >= n || j < 0 || j >= m) return 0;
            if (g[i][j] == 0) return 0;
            int area = 1;
            g[i][j] = 0;
            area += dfs(i + 1, j) + dfs(i - 1, j) + dfs(i, j - 1) + dfs(i, j + 1);
            return area;
        }


    }




// class Solution {
//    public static int maxAreaOfIsland(int[][] grid) {
//         int r = grid.length;
//         int c = grid[0].length;
//         boolean fk = false;
//         int x = 0;
//         Dsu dsu = new Dsu(r * c);
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 int magic = (c * i) + j;
//                 if (x == 0 && !fk) {
//                     if (grid[i][j] == 1) {
//                         x++;
//                         fk = true;
//                     }

//                 }
//                 if (i > 0) {
//                     if (grid[i][j] == 1 && grid[i - 1][j] == 1) {
//                         dsu.union(magic, magic - c);
//                     }
//                 }
//                 if (j > 0) {
//                     if (grid[i][j] == 1 && 1 == grid[i][j - 1]) {
//                         dsu.union(magic, magic - 1);
//                     }
//                 }
//                 if (i < r - 1) {
//                     if (grid[i][j] == 1 && 1 == grid[i + 1][j]) {
//                         dsu.union(magic, magic + c);
//                     }
//                 }
//                 if (j < c - 1) {
//                     if (grid[i][j] == 1 && 1 == grid[i][j + 1]) {
//                         dsu.union(magic, magic + 1);
//                     }
//                 }
//             }
//         }

//         return dsu.count() == (r * c) && !fk ? 0 : dsu.MaxSetSize();
//     }

//     static void debug(Object... obj) {
//         System.err.println(Arrays.deepToString(obj));
//     }

//     public static class Dsu {
//         int max;
//         int n, numberOfset;
//         int[] parent, setSize;

//         Dsu(int n) {
//             this.n = n;
//             numberOfset = n;
//             parent = new int[n];
//             setSize = new int[n];
//             for (int i = 0; i < n; i++) {
//                 parent[i] = i;
//                 setSize[i] = 1;
//             }
//         }

//         public int findSet(int u) {
//             if (u == parent[u]) return u;
//             return parent[u] = findSet(parent[u]);
//         }

//         public boolean isSameSet(int u, int v) {
//             return findSet(u) == findSet(v);
//         }

//         public void union(int u, int v) {
//             u = findSet(u);
//             v = findSet(v);
//             if (u == v) return;
//             if (setSize[u] <= setSize[v]) {
//                 int temp = u;
//                 u = v;
//                 v = temp;
//             }
//             parent[v] = u;
//             setSize[u] += setSize[v];
//             numberOfset--;
//         }

//         public int MaxSetSize() {
//             for (int i : setSize) if (i > max) max = i;
//             return max;
//         }

//         public int count() {
//             int cnt = 0;
//             for (int i = 0; i < n; i++) {
//                 if (i == parent[i]) cnt++;
//             }
//             return cnt;
//         }

//         public int setSize(int u) {
//             return setSize[u] = findSet(u);
//         }

//     }
// }

