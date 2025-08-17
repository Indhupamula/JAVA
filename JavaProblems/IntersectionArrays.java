// JavaProblems/IntersectionArrays.java
import java.util.*;

public class IntersectionArrays {
    public static int[] intersection(int[] nums1,int[] nums2){
        Set<Integer> set1=new HashSet<>();
        for(int n:nums1) set1.add(n);
        Set<Integer> set2=new HashSet<>();
        for(int n:nums2) if(set1.contains(n)) set2.add(n);
        int[] res = new int[set2.size()];
        int i=0;
        for(int n:set2) res[i++]=n;
        return res;
    }

    public static void main(String[] args){
        int[] nums1={1,2,2,1}, nums2={2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
}
