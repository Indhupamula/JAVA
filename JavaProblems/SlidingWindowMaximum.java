// JavaProblems/SlidingWindowMaximum.java
import java.util.*;

public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k){
        int n=nums.length;
        int[] res=new int[n-k+1];
        Deque<Integer> deque=new LinkedList<>();
        for(int i=0;i<n;i++){
            while(!deque.isEmpty() && deque.peek()<i-k+1) deque.poll();
            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]) deque.pollLast();
            deque.offer(i);
            if(i>=k-1) res[i-k+1]=nums[deque.peek()];
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums,k)));
    }
}
