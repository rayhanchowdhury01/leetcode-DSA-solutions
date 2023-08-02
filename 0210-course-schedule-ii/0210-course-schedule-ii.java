class Solution {
        ArrayList<Integer> res;
        ArrayList<Integer>[] adj;
        int[] inOrderDegree;

        public int[] findOrder(int numCourses, int[][] prerequisites) {

            adj = new ArrayList[numCourses];
            inOrderDegree = new int[numCourses];
            for (int i = 0; i < numCourses; i++) adj[i] = new ArrayList<>();
            for (int i = 0; i < prerequisites.length; i++) {
                adj[prerequisites[i][0]].add(prerequisites[i][1]);
                inOrderDegree[prerequisites[i][1]]++;
            }
            Topsort(numCourses);

            if (res.size() == numCourses) {
                int[] ans = new int[res.size()];
                int x = 0;
                for (int i = res.size() - 1; i >= 0; i--) {
                    ans[i] = res.get(x);
                    x++;
                }
                return ans;
            }
            int[] emptyArray = new int[0];
            return emptyArray;
        }

        public void Topsort(int numCourses) {
            Queue<Integer> q = new LinkedList<>();
            res = new ArrayList<>();
            for (int i = 0; i < numCourses; i++) {
                if (inOrderDegree[i] == 0) q.add(i);
            }
            while (!q.isEmpty()) {
                int current = q.peek();
                res.add(current);
                q.poll();
                for (int v : adj[current]) {
                    inOrderDegree[v]--;
                    if (inOrderDegree[v] == 0) q.add(v);
                }

            }
        }
    }