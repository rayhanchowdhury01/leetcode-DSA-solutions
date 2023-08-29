class Solution {
    public int bestClosingTime(String customers) {
        int sumY = 0, prefixSum = 0;

        for (char c : customers.toCharArray()) if (c == 'Y') sumY++;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, sumY);
        int i = 0;
        for (char c : customers.toCharArray()) {
            if (c == 'Y') prefixSum++;
            else prefixSum--;
            mp.put(++i, sumY - prefixSum);
            
        }
        int hours = customers.length(), previous = customers.length();
        for (Map.Entry<Integer, Integer> x : mp.entrySet()) {
            if (x.getValue() < previous) {
                hours = x.getKey();
                previous = x.getValue();
            }
        }
        return hours;
    }
}