// JavaProblems/CountVowelsConsonants.java
public class CountVowelsConsonants {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowels=0, consonants=0;
        for(char c: str.toLowerCase().toCharArray()) {
            if(c>='a' && c<='z') {
                if("aeiou".indexOf(c)>=0) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: "+vowels+", Consonants: "+consonants);
    }
}
