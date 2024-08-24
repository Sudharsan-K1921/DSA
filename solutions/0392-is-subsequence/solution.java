class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        int j=0;
        for(int i=0;i<m;i++){
            // if(!t.contains((Character.toString(s.charAt(i))))){
            //     return false;
            // }
            if(j==n) return true;
            if(t.charAt(i)==s.charAt(j)){
                j++;
            }
        }
        return j==n;
    }
}
