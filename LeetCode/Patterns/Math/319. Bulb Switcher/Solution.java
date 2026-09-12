// class Solution {
//     public int bulbSwitch(int n) {
//         return (int)Math.sqrt(n);
//     }
// }

class Solution {
    public int bulbSwitch(int n) {

        boolean[] bulbs = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n; j += i) {
                bulbs[j] = !bulbs[j];
            }
        }

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (bulbs[i]) {
                count++;
            }
        }

        return count;
    }
}