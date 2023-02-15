class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int res=0;
        for(String i :operations){
            if(i.charAt(0)=='+' ||i.charAt(2)=='+')res++;
            else res--;
        }
        return res;
       
    }
}