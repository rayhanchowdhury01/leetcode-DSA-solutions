class Solution {
    public int missingNumber(int[] nums) {
        
        int n=nums.length;
        int res= (n*(n+1))/2;
        int sum=0;
        for(int i :nums){
            sum+=i;
        }
        return (res-sum);
    }
}