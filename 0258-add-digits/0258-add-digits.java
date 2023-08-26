class Solution {
    public int addDigits(int num) {
        while(num > 9){
            int n = num;
            int temp = 0;
            while(n != 0){
                int rem =n % 10;
                temp+=rem;
                n /= 10;
            }
            num = temp; 
        }
        return num;
    }
}