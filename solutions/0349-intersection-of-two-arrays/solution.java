class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] count=new int[1001];
        List<Integer> list=new ArrayList<>();
        for(int num1:nums1) count[num1]=1;
        for(int num2:nums2){
            if(count[num2]==1){
                count[num2]=2;
            }
        }
        for(int i=0;i<count.length;i++){
            if(count[i]==2){
                list.add(i);
            }
        }
        int[] output=new int[list.size()];
        for(int i=0;i<list.size();i++){
            output[i]=list.get(i);
        }
        return output;
    }
}
