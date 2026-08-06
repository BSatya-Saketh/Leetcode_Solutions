class Solution {
    public boolean canMeasureWater(int a, int b, int target) {
        if(a+b < target) return false;
        if(target == 0 || a+b == target) return true;

        int gcd = GCD(a,b);
        if(target%gcd == 0)
            return true;
        return false;
    }
    public int GCD (int a, int b){
        while(b > 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public int max(int a, int b){
        return a>b?a:b;
    }
}