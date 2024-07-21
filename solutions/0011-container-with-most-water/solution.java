class Solution {
    public int maxArea(int[] height) {
        int output=0;
        int Left=0;
        int right=height.length-1;
        while(Left<right){
            int minheight=Math.min(height[Left],height[right]);
            output=Math.max(output,minheight*(right-Left));
            if(height[Left]<height[right]){
                Left++;
            }
            else{
                right--;
            }
        }
            return output;
    }
}
