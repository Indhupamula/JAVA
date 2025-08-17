// JavaProblems/ReverseString.java
import java.util.*;

public class ReverseString {
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Reversed: " + reverse(str));
    }
}
