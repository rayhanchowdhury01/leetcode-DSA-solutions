class Solution {
    public int finalValueAfterOperations(String[] operations) {
    
        int res=0;
        for(int i=0;i<operations.length;i++){
            String s=operations[i];
             if(s.charAt(0)=='+' ||s.charAt(2)=='+')res++;
            else res--;
        }
        return res;
       
    }
}