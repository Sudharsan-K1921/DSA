class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder build=new StringBuilder();
        int n1=word1.length();
        int n2=word2.length();
        int j=0;
        if(n1>=n2){
        for(int i=0;i<n1;i++){
            build.append(word1.charAt(i));
            if(j<n2){
            build.append(word2.charAt(j));
            }
            j++;
        }
        }
    
    else{
        for(int i=0;i<n2;i++){
            if(j<n1){  
            build.append(word1.charAt(j));
            }
            j++;
            build.append(word2.charAt(i));
        }
    }
    return build.toString();
    }
}
