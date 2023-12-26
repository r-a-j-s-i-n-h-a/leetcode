class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        
        return findMinRec(nums,start,end);
    }

    public int findMinRec(int[]nums, int start, int end){
         if((end-start)==0){
            return nums[start];
         }
        if((end-start)==1){
          return Math.min(nums[start],nums[end]);
        }
        int mid = start+(end-start)/2;
      //  System.out.println(start+" "+end+"  mid = "+mid);
        if (nums[start]<nums[mid] && nums[end]>=nums[mid]){
          return findMinRec(nums,start,mid);
        }
        else if(nums[start]>=nums[mid] && nums[end]<nums[mid]){
          return findMinRec(nums,mid+1,end);
        }
        else{
          return findMinRec(nums,start+1,end);
        }
       
    }
}