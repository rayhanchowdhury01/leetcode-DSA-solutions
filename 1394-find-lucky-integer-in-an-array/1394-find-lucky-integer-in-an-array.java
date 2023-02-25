class Solution {
    public int findLucky(int[] arr) {
        
        int[] fre = new int[501];
        for(int i = 0;i < arr.length; ++i){
            fre[arr[i]]++;
        }
        int lucky = -1;
        for(int i = 1;i < fre.length ; ++i){
            if(fre[i] == i) lucky = i;
        }
        return lucky;
    }
}