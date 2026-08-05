class Solution {
    public long sumAndMultiply(int n) {
        if (n == 0) return 0;

        long x = 0;
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            if (digit != 0) {
                x = x * 10 + digit;
            }
            temp /= 10;
        }

        long rev = 0;
        while (x > 0) {
            rev = rev * 10 + (x % 10);
            x /= 10;
        }

        return rev * sum;
    }
}