// JavaProblems/WordPattern.java
import java.util.*;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s){
        String[] words=s.split(" ");
        if(pattern.length()!=words.length) return false;
        Map<Character,String> map=new HashMap<>();
        Set<String> set=new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(words[i])) return false;
            } else {
                if(set.contains(words[i])) return false;
                map.put(c,words[i]);
                set.add(words[i]);
            }
        }
        return true;
    }

    public static void main(String[] args){
        String pattern="abba", s="dog cat cat dog";
        System.out.println("Word Pattern matches: "+wordPattern(pattern,s));
    }
}
