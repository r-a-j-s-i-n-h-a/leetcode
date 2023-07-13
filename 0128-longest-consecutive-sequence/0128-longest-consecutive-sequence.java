class Solution {
    public int longestConsecutive(int[] nums) {
     Arrays.sort(nums);
        int curr =0;
        int tar= Integer.MIN_VALUE;
        int longest=1; 
        if(nums.length==0){
            longest=0;
        }
     for(int i=0;i<nums.length;i++){
            if(nums[i]-1==tar){
                curr++;
                tar=nums[i];
                
            }
         if(nums[i]!=tar){
            curr=1;
             tar=nums[i];
         }
         longest=Math.max(curr,longest);
        }
        return longest;
    }
}