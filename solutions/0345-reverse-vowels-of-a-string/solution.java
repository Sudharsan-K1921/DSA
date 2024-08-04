class Solution {
    public String reverseVowels(String s) {
        
        // StringBuilder build=new StringBuilder();
        // StringBuilder build2=new StringBuilder();
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'||s.charAt(i)=='u'){
        //         build.append(s.charAt(i));
        //         build2.append(0);
        //     }
        //     else{
        //         build2.append(s.charAt(i));
        //     }

        // }
        // StringBuilder nB=new StringBuilder();
        // for(int i=1;i<build.length();i++){
        //      nB.append(build.charAt(i));
        // }
        // int j=0;
        // nB.append(build.charAt(j));
        // String[] ss=nB.toString().split("");
        // for(int i=0;i<build2.length();i++){
        //      if(build2.charAt(i)=='0'){
        //         build2.replace(i,i+1,ss[j]);
        //         j++;
        //      }
        // }
        // return build2.toString();
        char[] ch=s.toCharArray();
        int start=0;
        int end=ch.length-1;
        while(start<end){
            if(!Vowel(ch[start])){
                 start++;
            }
            else if(!Vowel(ch[end])){
                end--;
            }
            else{
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);


    }
    public boolean Vowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        return false;
    }
}
