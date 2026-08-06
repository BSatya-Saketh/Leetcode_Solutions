class Solution {
    public int clumsy(int n) {
        if (n <= 2) return n;
        if (n == 3) return 6;

        int result = n * (n - 1) / (n - 2) + (n - 3);
        n -= 4;

        while (n >= 3) {
            result -= n * (n - 1) / (n - 2);
            if (n - 3 > 0) result += (n - 3);
            n -= 4;
        }
        if(n > 0)
            result -= clumsy(n);

        return result;
    }
}