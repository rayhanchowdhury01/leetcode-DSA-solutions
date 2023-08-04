class Solution {
     public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        ArrayList<PAIR> p = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(nums[i])) mp.put(nums[i], mp.get(nums[i])+1);
            else mp.put(nums[i], 1);
        }
        for (Map.Entry<Integer, Integer> i : mp.entrySet()) {
            int key = i.getKey();
            int v = i.getValue();
            p.add(new PAIR(key,v));

        }
        Collections.sort(p);
        //for(PAIR i: p) debug(i.first,i.second);
        int[] res = new int[k];
        for(int i=p.size()-1,j=0;i>=0 && k>0;i--){
            res[j]=p.get(i).first;
            j++;
            k--;
        }


        return res;


    }

  public static class PAIR implements Comparable<PAIR> {
        int first, second;

        public PAIR(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int compareTo(PAIR ob) {
            return second - ob.second;
        }
    }
}