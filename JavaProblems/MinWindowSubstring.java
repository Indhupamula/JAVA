// JavaProblems/MinWindowSubstring.java
import java.util.*;

public class MinWindowSubstring {
    public static String minWindow(String s, String t) {
        if(s.length()==0 || t.length()==0) return "";
        Map<Character,Integer> map = new HashMap<>();
        for(char c: t.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);

        int left=0, right=0, required=t.length(), start=0, minLen=Integer.MAX_VALUE;
        while(right<s.length()) {
            char c = s.charAt(right++);
            if(map.containsKey(c)) {
                map.put(c,map.get(c)-1);
                if(map.get(c)>=0) required--;
            }

            while(required==0) {
                if(right-left<minLen) {minLen=right-left; start=left;}
                char leftChar = s.charAt(left++);
                if(map.containsKey(leftChar)) {
                    map.put(leftChar,map.get(leftChar)+1);
                    if(map.get(leftChar)>0) required++;
                }
            }
        }
        return minLen==Integer.MAX_VALUE? "":s.substring(start,start+minLen);
    }

    public static void main(String[] args) {
        System.out.println("Min Window: " + minWindow("ADOBECODEBANC","ABC"));
    }
}
