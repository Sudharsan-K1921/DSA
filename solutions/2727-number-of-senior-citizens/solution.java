class Solution {
    public int countSeniors(String[] details) {
            int count=0;
        for(int i=0;i<details.length;i++){
            String st=details[i];
            String add=""+st.charAt(11)+st.charAt(12);
            int value=Integer.parseInt(add);
            if(value>60){
                count++;
            }
        }
        return count;
    }
}
