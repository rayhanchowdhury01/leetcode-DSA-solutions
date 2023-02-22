class Solution {
    public int findDuplicate(int[] nums) {
        int[] track = new int[nums.length];
        int res=0;
        for(int i : nums){
            track[i]++;
            if(track[i]==2) {
                res=i;
                break;
            }
        } 
        
        return res;
    }
}