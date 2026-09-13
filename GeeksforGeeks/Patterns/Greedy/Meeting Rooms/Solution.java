class Solution {
    static boolean canAttend(int[][] arr) {
        // code here
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {

        //         if (arr[i][0] > arr[j][0]) {
        //             // int temp1 = arr[i][0];
        //             // int temp2 = arr[i][1];

        //             // arr[i][0] = arr[j][0];
        //             // arr[i][1] = arr[j][1];

        //             // arr[j][0] = temp1;
        //             // arr[j][1] = temp2;
                    
        //             // int[] temp = arr[i];
        //             // arr[i] = arr[j];
        //             // arr[j] = temp;
        //         }
        //     }
        // }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] < arr[i - 1][1]) {
                return false;
            }
        }

        return true;
    }
}