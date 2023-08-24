class Solution {
   public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> mp = new HashMap<>();
        for (String i : strs) {
            char[] ch = i.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if (!mp.containsKey(key)) mp.put(key, new ArrayList<>());
            mp.get(key).add(i);
        }
        return new ArrayList<>(mp.values());
    }
}