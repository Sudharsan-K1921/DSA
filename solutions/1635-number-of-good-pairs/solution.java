class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        int[] result=Arrays.copyOf(nums,nums.length);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
            if(nums[i]==result[j]){
                count++;
            }
            }
        }
        return count;
    }
}
