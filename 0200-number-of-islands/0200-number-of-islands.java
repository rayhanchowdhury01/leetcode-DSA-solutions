
public class Solution {
    static int n, m;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static int numIslands(char[][] grid) {
        int cc = 0;
        n = grid.length;
        m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    Dfs(i, j, grid);
                    cc++;
                }
            }
        }

        return cc;
    }

    public static void Dfs(int i, int j, char[][] grid) {
        if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == '0') return;
        grid[i][j] = '0';
        for (int x = 0; x < 4; x++) {
            Dfs(i + dx[x], j + dy[x], grid);
        }
    }

}
