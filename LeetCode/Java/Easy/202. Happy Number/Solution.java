class Solution {
    public boolean isHappy(int n) {
        // while(n!=1 && n!=4){
        //     n = sum(n);
        // }
        // return n==1;

        int sum = 0;
        while(n != 0){
            sum += (n%10)*(n%10);
            n /= 10;
            if(n == 0){
                if (sum == 1){
                    return true;
                }
                if (sum == 4){
                    return false;
                }
                if (sum > 0){
                    n = sum;
                    sum = 0;
                }
            }
        }
        return n==1;
    }
    // public int sum(int n){
    //     int sum = 0;
    //     while(n>0){
    //         int digit = n%10;
    //         sum += (digit*digit);
    //         n /= 10;
    //     }
    //     return sum;
    // }
}