class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int first=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
              if(first==nums[i]){
                count++;
              }
              else{
                count--;
              }
              if(count==0){
                first=nums[i];
                count=1;
              }
        }
        return first;
    }
}
