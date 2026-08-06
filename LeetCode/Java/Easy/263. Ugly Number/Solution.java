class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        // if(n>Integer.MAX_VALUE || n < Integer.MIN_VALUE) return false;
        
        while(n%2==0)
            n /= 2;
        while(n%3 == 0)
            n /= 3;
        while (n%5 == 0)
            n /= 5;
        
        return n==1;

        // for (int i=7;i<=n ;i++){
        //     int cnt = 0;
        //     for( int j=1; j*j<=i; j++){
        //         if(i%j == 0)
        //             cnt++;
        //     }
        //     if (cnt == 1 && n%i == 0)
        //         return false;
        // }
        // return true;
    }
}