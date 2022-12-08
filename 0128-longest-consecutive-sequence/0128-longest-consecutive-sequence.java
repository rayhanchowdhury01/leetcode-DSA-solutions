
import java.util.*;
import java.io.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        Dsu dsu = new Dsu(nums.length);
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(nums[i])) continue;
            if (mp.containsKey(nums[i] - 1)) dsu.union(i, mp.get(nums[i] - 1));
            if (mp.containsKey(nums[i] + 1)) dsu.union(i, mp.get(nums[i] + 1));
            mp.put(nums[i], i);
        }
        return dsu.MaxSetSize();
    }

    public class Dsu {
        int n;
        int[] parent, setSize;

        Dsu(int n) {
            this.n = n;
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
        }

        public int MaxSetSize() {
            int max = 0;
            for (int i : setSize) if (i > max) max = i;
            return max;
        }

        public int setSize(int u) {
            return setSize[u] = findSet(u);
        }

    }
}

