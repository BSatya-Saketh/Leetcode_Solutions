class Solution {
    public int arrangeCoins(int n) {
        int cnt=0;
        int sub=n;

        while(sub > 0){
            cnt++;
            sub = sub-cnt;
        }
        if(sub < 0)
            cnt--;
        return cnt;
    }
}