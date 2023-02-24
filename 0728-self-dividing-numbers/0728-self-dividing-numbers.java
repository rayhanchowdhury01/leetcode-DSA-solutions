class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> lst = new ArrayList<>();
        for (int i = left; i <= right; ++i) {
            if (i <= 9) lst.add(i);
            else {
                int temp = i;
                boolean x = true;
                while (temp > 0) {
                    int digit = temp % 10;
                    temp /= 10;
                    if(digit == 0){
                        x = false;
                        break;
                    } 
                    if (i % digit != 0) {
                        x = false;
                        break;
                    }
                }
                if (x) lst.add(i);
            }
        }
        return lst;
    }
}