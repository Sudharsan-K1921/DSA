class Solution {
    public int missingNumber(int[] nums) {
       Arrays.sort(nums);
       int val=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=i){
            val=i;
            break;
        }
        else{
            val=nums[nums.length-1]+1;
        }
       } 
       return val;
    }
}
