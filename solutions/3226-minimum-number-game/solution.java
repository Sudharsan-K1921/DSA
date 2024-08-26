class Solution {
    public int[] numberGame(int[] nums) {
        int[] res=new int[nums.length];
        Arrays.sort(nums);
        int j=1;
        for(int i=0;i<nums.length-1;i+=2){
               res[i]=nums[j];
               res[i+1]=nums[i];
               j+=2;
        }
        return res;
    }
}
