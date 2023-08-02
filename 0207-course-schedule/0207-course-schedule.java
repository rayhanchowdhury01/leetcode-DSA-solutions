 class Solution {
        int res;
        ArrayList<Integer>[] adj;
        int[] inOrderDegree;

        public boolean canFinish(int numCourses, int[][] prerequisites) {

            adj = new ArrayList[numCourses];
            inOrderDegree = new int[numCourses];
            for (int i = 0; i < numCourses; i++) adj[i] = new ArrayList<>();
            for (int i = 0; i < prerequisites.length; i++) {
                adj[prerequisites[i][0]].add(prerequisites[i][1]);
                inOrderDegree[prerequisites[i][1]]++;
            }
            Topsort(numCourses);

            return res == numCourses;
        }

        public void Topsort(int numCourses) {
            Queue<Integer> q = new LinkedList<>();
            res = 0;
            for (int i = 0; i < numCourses; i++) {
                if (inOrderDegree[i] == 0) q.add(i);
            }
            while (!q.isEmpty()) {
                int current = q.peek();
                res++;
                q.poll();
                for (int v : adj[current]) {
                    inOrderDegree[v]--;
                    if (inOrderDegree[v] == 0) q.add(v);
                }

            }
        }
 }