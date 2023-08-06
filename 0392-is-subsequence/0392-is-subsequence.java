class Solution {
    public boolean isSubsequence(String s, String t) {
        // 1 ms code beat 53% 
        // int si=0;
        // if(s.length()<1)
        //     return true;
        // for(int i=0;i<t.length();i++){
        //     if(s.charAt(si)==t.charAt(i))
        //         si++;

        //     if(si==s.length())
        //         return true;
        // }


    // 1 ms beat 100
    int i=0,j=0;
    int n=t.length();
    int m=s.length();
    char ss[]=s.toCharArray();
    char tt[]=t.toCharArray();

    if(m<1)
        return true;

    while(i<n){
        if(tt[i]==ss[j]){
            j++;
        }
        i++;
        
    if(j==m)
        return true;
    }

        return false;
    }
}