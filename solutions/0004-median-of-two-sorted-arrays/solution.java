//two
import java.util.*;
import java.util.Collections;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            list.add(nums2[i]);
    }
     Collections.sort(list);
     int len=list.size();
     if(len%2==1){
        return (double)list.get(len/2);
     }
     else{
        int mid=list.get((len/2) -1);
        int mid2=list.get(len/2);
        return ((double)mid+(double)mid2)/2.0;
     }

    }
}
