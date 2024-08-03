class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int key=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                key=i;
                break;
            }
            else if(nums[i]>target){
                key=i;
                break;
            }
            else{
                key=nums.length;
            
            }
           
        }
        return key;
    }
}
