class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        for(int i = 0; tickets[k] != 0; i++){
            if(i == tickets.length)
                i = 0;
            if(tickets[i] == 0)
                continue;
            tickets[i] -= 1;
            time++;
            if(tickets[k] == 0)
                return time;
            // System.out.print(tickets[k]+" ");
        }
        return time;
    }
}