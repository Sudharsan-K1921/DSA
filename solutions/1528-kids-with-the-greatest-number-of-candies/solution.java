class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       int c=0;
       for(int candy:candies){
        c=Math.max(c,candy);
       } 
       List<Boolean> res=new ArrayList<>();
       for(int val:candies){
        res.add(val+extraCandies >= c);
       }
       return res;
    }
}
