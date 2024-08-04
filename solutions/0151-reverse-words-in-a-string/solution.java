class Solution {
    public String reverseWords(String s) {
        StringBuilder build=new StringBuilder();
        String[] str=s.split("\\s+");
        for(int i=str.length-1;i>=0;i--){
          if(!str[i].isEmpty()){
            if(build.length()>0){
            build.append(" ");
            }
            build.append(str[i]);
          }
        }
        return build.toString();
    }
}
