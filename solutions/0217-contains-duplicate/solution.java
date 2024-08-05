class Solution {
    public boolean containsDuplicate(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        for(int ns:nums){
            set.add(ns);
        }
        int m=set.size();
        if(n==m){
        return false;
        }
        return true;
    }
}
