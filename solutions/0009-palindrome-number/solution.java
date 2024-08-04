class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int org=x;
        while(org>0){
               int digit=org%10;
                rev=rev*10+digit;
                org/=10;
        }
        
        return (x==rev);
    }
}
