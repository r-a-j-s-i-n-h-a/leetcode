class Solution {
      public boolean searchMatrix(int[][] matrix, int target) 
    {
        int row=matrix.length;
        int col=matrix[0].length;
        
       for(int i=0; i<row ; i++)
       {
           if(target>=matrix[i][0] && target <=matrix[i][col-1])
           {
               if(binarysearch(matrix[i],0,col-1,target))//binary search for finding in perticular row
                    return true;
           }
       }
        
        return false;    
    }

    public boolean binarysearch(int[] nums,int s,int e,int target) //binary search function
    {
        if(s<=e)
        {
            int mid=(s+e)/2;
            if(nums[mid]==target)
                return true;
            else if(target>nums[mid])
                return binarysearch(nums,mid+1,e,target);
            else
                return binarysearch(nums,s,mid-1,target);            
        }
        return false;
    }
}
