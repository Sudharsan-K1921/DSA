class Solution {
    public boolean isPerfectSquare(int n) {
        int i = 1, count = 0, a=n;
        try {
            while (n >0) {
                i+= 2;
                count++;
                n-= i;
            }
            return (count*count == a ? true : false);
        } catch (Exception e) {
        }
        return false ;
    }
}
