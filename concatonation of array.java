class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] res = new int[2* nums.length];
        
        for(int i = 0; i < nums.length; i++)
        {
            res[i] = nums[i];
        }
        int j = 0;
        for(int i = nums.length; i < 2 * nums.length; i++)
        { 
            res[i] = nums[j++];
        }
        
        return res;
   
    }
}
