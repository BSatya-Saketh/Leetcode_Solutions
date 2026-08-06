class Solution {
    public int rotatedDigits(int n) {
        int cnt=0;

        outer: for (int i = 1; i <= n; i++){
            int temp = i;
            boolean valid = false;

            inner: while(temp > 0){
                int digit = temp % 10;
                if (digit == 2 || digit == 5 || digit == 6  || digit == 9) 
                    valid = true;
                else if(digit == 3 || digit == 4 || digit == 7) 
                    continue outer;
                temp /= 10;
            }
            if (valid)
                cnt++;
        }

        return cnt;
    }
}