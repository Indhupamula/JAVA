// JavaProblems/SlidingWindowMedian.java
import java.util.*;

public class SlidingWindowMedian {
    public static double[] medianSlidingWindow(int[] nums, int k){
        int n=nums.length;
        double[] res=new double[n-k+1];
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            if(maxHeap.isEmpty() || nums[i]<=maxHeap.peek()) maxHeap.offer(nums[i]);
            else minHeap.offer(nums[i]);
            if(maxHeap.size()>minHeap.size()+1) minHeap.offer(maxHeap.poll());
            else if(minHeap.size()>maxHeap.size()) maxHeap.offer(minHeap.poll());
            if(i>=k-1){
                res[i-k+1]= (maxHeap.size()==minHeap.size()) ? (maxHeap.peek()+minHeap.peek())/2.0 : maxHeap.peek();
                int out=nums[i-k+1];
                if(out<=maxHeap.peek()) maxHeap.remove(out);
                else minHeap.remove(out);
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums={1,3,-1,-3,5,3,6,7};
        double[] medians=medianSlidingWindow(nums,3);
        System.out.println(Arrays.toString(medians));
    }
}
