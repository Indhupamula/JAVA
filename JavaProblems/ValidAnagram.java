// JavaProblems/ValidAnagram.java
import java.util.*;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] count = new int[26];
        for(char c: s.toCharArray()) count[c-'a']++;
        for(char c: t.toCharArray()) if(--count[c-'a']<0) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is Anagram: " + isAnagram("listen","silent"));
    }
}
