class Solution {
    public int[] sortedSquares(int[] nums) {
        int c=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[c]=nums[i]*nums[i];
            c++;
            
        }
        Arrays.sort(arr);
        return arr;

    }
}