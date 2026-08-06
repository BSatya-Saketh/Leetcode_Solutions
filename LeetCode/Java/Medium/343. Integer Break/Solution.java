class Solution {
    public int integerBreak(int n) {
        if(n < 3)
            return 1;
        if(n == 3)
            return 2;

        if (n%3 == 0)
            return pow(3, n/3);
        else if (n%3 == 1)
            return pow(3, (n-4)/3)*4;
        else
            return pow(3, (n-2)/3)*2;
    }

    public int pow(int base, int exp){
        int result = 1;
        for(int i = 0; i<exp; i++)
            result *= base;
        
        return result;
    }
}