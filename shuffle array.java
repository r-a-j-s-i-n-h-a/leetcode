class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a=0;
        int b=n;
        int c=0;
        int arr[]=new int[n*2];
        while(n!=0){
            arr[a]=nums[c];
            arr[a+1]=nums[b];
            a+=2;
            b+=1;
            c++;
            n--;
        }
        return arr;
    }
}
