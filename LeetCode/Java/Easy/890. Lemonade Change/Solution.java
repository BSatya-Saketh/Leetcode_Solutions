class Solution {
    public boolean lemonadeChange(int[] bills) {
        int ch5 = 0;
        int ch10 = 0; 

        for (int i = 0; i<bills.length; i++){
            if(bills[i] == 5){
                ch5 += bills[i];
            }
            else if(bills[i] == 10 && ch5 > 0){
                ch5 -= 5;
                ch10 += bills[i];

                if(ch5 < 0)
                    return false;
            }
            else if(bills[i] == 20 && ch5 > 0 && ch10 > 0){
                ch5 -= 5;
                ch10 -= 10;
                if(ch5 < 0 && ch10 <0)
                    return false;
            }
            else if(bills[i] == 20 && ch5 > 0 && ch10 == 0){
                ch5 -= 15;
                if(ch5 < 0){
                    return false;
                }
            }
            else
                return false;
        }
        return ch5>=0 && ch10>=0;
    }
}