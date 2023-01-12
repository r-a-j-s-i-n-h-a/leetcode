class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         ArrayList<Integer> v = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                v.add(nums[i]);
            }
        }
        return v;
    }
}