class Solution {
    public int minOperations(int n) {
        // int cnt = 0;
        // int[] arr = new int[n];
        // for(int i = 0; i<n; i++)
        //     arr[i] = 2*i+1;
        
        // for(int i = 0; i<n/2; i++){
        //     while(arr[i] != arr[n-i-1]){
        //         arr[i]++;
        //         arr[n-i-1]--;
        //         cnt++;
        //     }
        // }

        // return cnt++;

        return n*n/4;
    }
}