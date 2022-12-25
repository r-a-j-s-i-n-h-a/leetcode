class Solution {
    public int[] runningSum(int[] nums) {
        int a=0;
        int b=nums.length;
        int nums2[] = new int[b];
        for(int i=0;i<b;i++){
            int c=nums[i];
            a=a+c;
            
            nums2[i]=a;

        }
        return nums2;
    }
}
