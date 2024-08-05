class Solution {
    public int singleNumber(int[] nums) {
        // int max=0;
        // for(int n:nums){
        // //     if(max<n){
        // //         max=n;
        // //     }
        // // }
        // // boolean[] sol=new boolean[max+1];
        // // for(int nu:nums){
        // //     if(!sol[nu]){
        // //         return nu;
        // //     }
        // //     else{
        // //       sol[nu]=true;
        // //     }
        // // }
        // // return 1;
        // Arrays.sort(nums);
        // int val=0;
        // int j=1;
        // if(nums.length==1) return 1;
        // for(int i=0;i<nums.length;){
        //     if(nums[i]==nums[j]){
        //          i+=2;
        //          j+=2;
        //     }
        //     else{
        //         val=nums[i];
        //         i++;
        //     }
        // }
        // return val;

        // for(int i=0;i<nums.length;i++){
        //     int count=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count==1){
        //         return nums[i];
        //     }
        // }
        // return -1;
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}
