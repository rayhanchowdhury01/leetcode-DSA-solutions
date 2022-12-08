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