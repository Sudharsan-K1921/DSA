class Solution {
    public int[] plusOne(int[] digits) {
        //  long number=0;
        // for(int n:digits){
        //     number=number*10+n;
        // }
        // number+=1;
        // String val=Long.toString(number);
        // String[] str=val.split("");
        // int[] res=new int[str.length];
        // for(int i=0;i<str.length;i++){
        //     res[i]=Integer.parseInt(str[i]);
        // }
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]+1 != 10){
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;
        }
        int[] nDigit=new int[digits.length+1];
        nDigit[0]=1;
        return nDigit;
    }
}
