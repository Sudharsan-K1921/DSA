class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> s=new HashMap<>();
        for(String st:arr){
            s.put(st,s.getOrDefault(st,0)+1);
        }
        String ans="";
        int count=0;
        for(String x:arr){
            if(s.get(x)==1){
                ans=x;
                count++;
            }
            if(count==k){
                return ans;
            }
        }
        return "";
    }
}
