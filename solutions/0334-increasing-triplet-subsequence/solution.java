class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first=Integer.MAX_VALUE;
      int Second=Integer.MAX_VALUE;
      for(int n:nums){
        if(n<=first){
            first=n;
        }
        else if(n<=Second){
            Second=n;
        }
        else{
            return true;
        }
      }
        return false;
    }
}
