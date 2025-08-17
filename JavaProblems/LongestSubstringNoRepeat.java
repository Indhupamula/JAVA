// JavaProblems/LongestSubstringNoRepeat.java
import java.util.*;

public class LongestSubstringNoRepeat {
    public static int lengthOfLongestSubstring(String s){
        Map<Character,Integer> map = new HashMap<>();
        int left=0,max=0;
        for(int right=0;right<s.length();right++){
            if(map.containsKey(s.charAt(right))) left=Math.max(map.get(s.charAt(right))+1,left);
            map.put(s.charAt(right),right);
            max=Math.max(max,right-left+1);
        }
        return max;
    }

    public static void main(String[] args){
        String s="abcabcbb";
        System.out.println("Longest substring length: "+lengthOfLongestSubstring(s));
    }
}
