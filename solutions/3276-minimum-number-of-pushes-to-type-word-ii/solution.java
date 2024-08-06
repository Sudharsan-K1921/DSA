class Solution {
    public int minimumPushes(String word) {
        int[] arr=new int[26];
        for(char ch:word.toCharArray()){
            arr[ch-'a']++;
        }
        Arrays.sort(arr);
        int res=0;
        for(int i=0;i<arr.length;i++){
            res+=arr[26-i-1]*((i/8)+1);
        }
        return res;
    }
}
