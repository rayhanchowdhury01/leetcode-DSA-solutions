class Solution {
    public static class PAIR implements Comparable<PAIR> {
        char c;
        int freq;

        public PAIR(char c, int freq) {
            this.c = c;
            this.freq = freq;
        }

        public int compareTo(PAIR obj) {
            return obj.freq - this.freq;
        }


    }

     public String reorganizeString(String s) {

        HashMap<Character, Integer> mp = new HashMap<>();
        for (char i : s.toCharArray()) {
            int max = mp.getOrDefault(i, 0) + 1;
            if (max > (s.length() + 1) / 2) return "";
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        PriorityQueue<PAIR> p = new PriorityQueue<>();
        for (Character key : mp.keySet()) {
            p.offer(new PAIR(key, mp.get(key)));
        }
        PAIR previous = p.poll();
        sb.append(previous.c);
        previous.freq--;
        while (!p.isEmpty()) {
            PAIR current = p.poll();
            sb.append(current.c);
            current.freq--;
            if (previous.freq > 0) p.offer(previous);
            previous = current;
        }
        return sb.toString();

    }
}