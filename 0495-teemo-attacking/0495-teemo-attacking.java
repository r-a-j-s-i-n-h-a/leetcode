class Solution {
    public int findPoisonedDuration(int[] t, int d) {
        
        int sum = d;
        int temp = t[0] + d - 1;

        for (int i = 1; i < t.length; i++) {
            if (t[i] > temp){
                sum += d;
            }
            else {
                sum += t[i] + d - 1 - temp;
            }
            temp = t[i] + d - 1;
        }
        return sum;
    }
}