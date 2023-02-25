class Solution {
    public int findLucky(int[] arr) {
        
        int[] frequency = new int[501];
        for(int i = 0;i < arr.length; ++i)
            frequency[arr[i]]++; 
        
       
        for(int i = 500;i >=1 ; --i)
            if(frequency[i] == i) return i;
        
        return -1;
    }
}