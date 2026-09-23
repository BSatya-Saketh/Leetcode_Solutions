class Solution {
    public int reverse(int x) {
        long rev=0;

        while(x != 0){
            rev = rev*10 + (x%10);
            x/=10;
        }
        if(Integer.MAX_VALUE < rev || Integer.MIN_VALUE > rev)
        return 0;

        return (int)rev;
    }
}