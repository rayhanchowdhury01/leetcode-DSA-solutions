
class Solution {
    static int[] color;
    public boolean isBipartite(int[][] g) {
        color = new int[g.length];
        return Solve(g);
    }
    public static boolean Solve(int[][] g) {
        for (int i = 0; i < g.length; i++) {
            if (color[i] == 0) {
                color[i] = 1;
                Queue<Integer> que = new ArrayDeque<>();
                que.add(i);
                while (!que.isEmpty()) {
                    int u = que.poll();
                    for (int v : g[u]) {
                        if (color[v] == color[u]) return false;
                        if (color[v] == 0) {
                            que.add(v);
                            color[v] = -color[u] ;
                        }
                    }
                }

            }
        }
        return true;
    }

}