class Solution {
    public int[] buildArray(int[] nums) {
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            result[i]=nums[val];
        }
        return result;
    }
}
