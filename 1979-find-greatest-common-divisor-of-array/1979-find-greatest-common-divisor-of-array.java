class Solution {
    public int findGCD(int[] a) {
        int max = -1, min = Integer.MAX_VALUE;
        for(int i =0 ;i < a.length; i++){
            if(a[i] < min ) min = a[i];
            if(a[i] > max) max = a[i];
        }
        return gcd(min, max);
    }
    
    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}