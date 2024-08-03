class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            int val=haystack.indexOf(needle);
            return val;
        }
        return -1;
    }
}
