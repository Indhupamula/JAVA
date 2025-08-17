// JavaProblems/IsomorphicStrings.java
import java.util.*;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s,String t){
        Map<Character,Character> map=new HashMap<>();
        Set<Character> used=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char sc=s.charAt(i), tc=t.charAt(i);
            if(map.containsKey(sc)){
                if(map.get(sc)!=tc) return false;
            } else {
                if(used.contains(tc)) return false;
                map.put(sc,tc);
                used.add(tc);
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println("Isomorphic: "+isIsomorphic("egg","add"));
    }
}
