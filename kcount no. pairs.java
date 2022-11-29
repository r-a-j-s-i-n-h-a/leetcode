class Solution {
    public int countKDifference(int[] nums, int k) {
        int nums2[] = new int[nums.length];
        nums2=nums;
        for (int i = 0; i < nums.length; i++)
            nums2[i] = nums[i];
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]-nums2[j]==-k || nums[i]-nums2[j]==k){
                    count ++;
                }
            }
        }
        return count;
    }
}
