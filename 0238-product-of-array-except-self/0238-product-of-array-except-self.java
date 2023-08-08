class Solution {
    public int[] productExceptSelf(int[] nums) {
        int k=1;
        int left[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
             k=k*nums[i];
            left[i]=k;
        }
        int product=1;
       
        for(int i=left.length-1;i>0;i--){
            
            left[i]=product*left[i-1];
            product=product*nums[i];
            
        }
        left[0]=product;
        return left;
    }
}