class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int x = 100000+5;
        int[] temp = new int[x];
        boolean present[] = new boolean[x];
        int maxelement = Integer.MIN_VALUE;
        for(int i : nums){
            if(i>=0 && i<x) present[i] = true;
            maxelement = Math.max(i,maxelement);
        }
        
        for(int i=1;i<x;i++){
            if(!present[i]) return i;
        }
        return maxelement;
    }
}