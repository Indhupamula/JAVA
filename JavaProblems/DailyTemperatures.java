// JavaProblems/DailyTemperatures.java
import java.util.*;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] T){
        int n=T.length;
        int[] res=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && T[i]>T[stack.peek()]){
                int idx=stack.pop();
                res[idx]=i-idx;
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args){
        int[] T={73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(T)));
    }
}
